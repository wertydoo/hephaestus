# hephaestus
Kotlin utilities library for Driscoll ecosystem

##Important concepts
####Docker
The docker-compose.yml is set up to run a postgres instance at localhost:5433 (to not conflict with other potential postgres instances on a computer). This needs to be run first otherwise the app won't work properly.

####Flyway Migration
Right now, the main functionality of Hephaestus is to instantiate the Docker connection (or any Postgres instance) with the appropiate database schemas/tables/etc. Flyway allows us to write SQL scripts that change our database and keeps track of those changes. 
DO NOT EDIT YOUR DATABASE OUTSIDE OF A FLYWAY SCRIPT. It's fixable but requires a lot of unnecessary effort. Contact Thomas if you screw this up at any point AND you can't figure it out.

####Common classes
DriscollResponse - Generic response class all Driscoll Apis will use
DriscollException - Generic exception class that all Driscoll Apis will use. See template's GlobalExceptionHandler for how these are handled.
