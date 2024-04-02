package co.simplon.hopital.business.service.user;

import org.springframework.security.core.userdetails.UserDetails;


public interface IUserService {
	
	public UserDetails loadUserByUsername(final String username);

}
