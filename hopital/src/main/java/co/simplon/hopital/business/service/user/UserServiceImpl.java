package co.simplon.hopital.business.service.user;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import co.simplon.hopital.persistance.entity.User;
import co.simplon.hopital.persistance.repository.IUserRepository;

@Service
public class UserServiceImpl implements IUserService, UserDetailsService {
	
	private IUserRepository repo;

	@Override
	public UserDetails loadUserByUsername(String username) {
		User user = repo.findUserByName(username);
		if (user == null) {
			throw new UsernameNotFoundException("User not found with username: " + username);
		}
		return new org.springframework.security.core.userdetails.User(user.getUserName(), user.getUserPassword(),
				getAuthorities(user));
	}
	
	private Set<GrantedAuthority> getAuthorities(User user) {
		Set<GrantedAuthority> authorities = new HashSet<>();
		authorities.add(new SimpleGrantedAuthority(user.getUserRole()));
		return authorities;
	}

	@Autowired
	public void setRepo(IUserRepository repo) {
		this.repo = repo;
	}
	
}
