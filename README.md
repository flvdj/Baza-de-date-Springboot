# Aplicație Web - Gestionare Călători și Sucursale CFR cu Spring Boot

## Descriere
Această aplicație web este dezvoltată utilizând **Spring Boot**, **MySQL** și **Thymeleaf**, având ca scop gestionarea unei baze de date pentru călători și sucursale CFR. Aplicația permite efectuarea operațiilor CRUD (Creare, Citire, Actualizare, Ștergere) asupra tabelelor și gestionează o relație de tip M:N între „Travellers” și „BranchCFR” prin intermediul tabelei intermediare „Journey”.

## Tehnologii utilizate
- **Spring Boot** - Framework Java pentru dezvoltarea aplicațiilor web.
- **MySQL** - Sistem de gestionare a bazelor de date relaționale.
- **Apache Tomcat** - Server de aplicații pentru rularea codului Java.
- **Thymeleaf** - Motor de template-uri pentru generarea interfețelor HTML.
- **HTML / CSS / JavaScript** - Crearea interfeței utilizatorului pentru interacțiunea cu baza de date.

## Structura bazei de date
- **Travellers** (id, nume, email, telefon, etc.)
- **BranchCFR** (id, denumire, locație, etc.)
- **Journey** (id, id_traveller, id_branchcfr, data_călătoriei)

Relațiile dintre tabele:
- Între „Travellers” și „BranchCFR” există o relație M:N prin tabela „Journey”.
- Între „Travellers” și „Journey” există o relație 1:N.
- Între „BranchCFR” și „Journey” există o relație 1:N.

## Funcționalități implementate
1. **Conectarea la baza de date** utilizând Hibernate și `application.properties`.
2. **Operații CRUD** pentru toate tabelele, implementate prin Spring Data JPA.
3. **Interfață HTML interactivă** realizată cu Thymeleaf.
4. **Gestionarea excepțiilor** pentru prevenirea erorilor de introducere a datelor.
5. **Navigare între pagini** și manipulare dinamică a datelor.
6. **Integrarea Apache Tomcat** pentru rularea serverului web.

## Instalare și utilizare
1. **Clonați repository-ul** în local:
   ```bash
   git clone https://github.com/username/repository.git
   ```
2. **Configurați baza de date MySQL** utilizând scriptul SQL furnizat.
3. **Porniți aplicația Spring Boot** folosind Maven sau Gradle:
   ```bash
   mvn spring-boot:run
   ```
   sau
   ```bash
   ./gradlew bootRun
   ```
4. **Accesați interfața aplicației** prin browser, navigând la:
   ```
   http://localhost:8080
   ```



## Autori
- **Student:** Nistor Flaviu-Cristian (431D)
- **Coordonator:** Ș.l. Dr. Ing. Pupezescu Valentin

## Licență
Acest proiect a fost realizat în cadrul Universității Naționale de Știință și Tehnologie Politehnica București, Facultatea de Electronică, Telecomunicații și Tehnologia Informației, 2024.

