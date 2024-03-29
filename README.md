# HopitalBack

## Introduction
Bienvenue dans la documentation de l'API Hopital. Cette API a été développée dans le cadre d'un ECF. Ce projet vise à développer une application permettant de gérer les séjours des patients dans un établissement de santé. L'application doit pouvoir ajouter de nouveaux patients, modifier les patients existants, gérer l'arrivée et la sortie des patients dans les services, et affecter les patients à des lits dans des chambres.

## Architecture
L'API Hopital suit une architecture n-tier, ce qui signifie qu'elle est divisée en plusieurs couches logiques pour garantir la séparation des préoccupations et améliorer la maintenabilité du système. Voici les principales couches de l'architecture :

- **Couche Présentation** : Cette couche est responsable de la gestion des requêtes HTTP entrantes et de la fourniture des réponses appropriées. Elle comprend les contrôleurs API qui reçoivent les requêtes des clients et interagissent avec les autres couches de l'application.
  
- **Couche Business** : Cette couche contient la logique métier de l'application. Elle gère la logique complexe liée aux patients, lits, etc. Elle traite les données reçues des contrôleurs, applique les règles métier et interagit avec la couche d'accès aux données. Elle comprend les services, les DTO et les convert.
  
- **Couche Persistance** : Cette couche est responsable de l'accès aux données. Elle communique avec la base de données pour récupérer, insérer, mettre à jour ou supprimer des données. Elle utilise des entités et des repository pour gérer les opérations de base de données.

## Requêtes SQL

- Afficher les noms et prénoms de tous les patients affectés au service "Urgences"
```sql
SELECT p.patient_firstname, p.patient_name 
FROM hopital.patient p 
INNER JOIN hopital.bed b 
ON p.id_bed = b.bed_id 
INNER join hopital.room r 
ON b.room_id = r.room_id 
INNER JOIN hopital.service s 
ON s.service_id = r.service_id 
WHERE s.service_name = "urgence" ;
```

- Afficher tous les lits actuellement libres
```sql
SELECT * 
FROM hopital.bed 
WHERE bed_statut = false;
```

## Endpoints

Voici les endpoints disponibles dans notre API :

### Patient
- **GET /patients** : Récupérer la liste de tous les patients.
- **GET /patients/{id}** : Récupérer les informations d'un patient spécifique par son ID.
- **POST /patients** : Ajouter un nouveau patient.
- **PUT /patients** : Modifier les informations d'un patient existant.
- **DELETE /patients** : Supprimer un patient.
- **PUT /affectPatients/{id}** : Affecter un patient à un lit
- **PUT /removePatients** : Retirer un patient d'un lit
- **GET /patientsFromService/{name}** : Récupérer les informations d'un patient avec le nom d'un service

### Bed
- **GET /beds** : Récupérer la liste de tous les lits
- **Get /freebeds** : Récupérer la liste de tous les lits libre

### Room
- **GET /rooms** : Récupérer la liste de toutes les chambres

### Service
- **GET /services** : Récupérer la liste de tous les services

## Installation et Configuration
Pour installer et configurer l'API E-commerce, suivez les étapes ci-dessous :
1. Clonez le dépôt depuis GitHub : `https://github.com/Thomas6A/HopitalBack`.
2. Accédez au répertoire du projet : `cd hopital`.
3. Installez la base de données en accédant au répertoire Docker e-commerce : `cd Docker` et entrez la commande `docker compose up`: .
4. Démarrez l'API : Exécutez l'application depuis votre environnement de développement.

## Auteurs

https://github.com/Thomas6A