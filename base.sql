CREATE DATABASE poketra;

\c poketra;

CREATE TABLE look(
    id SERIAL,
    libelle VARCHAR(100),
    MP VARCHAR(100)
);

CREATE TABLE matiereP(
    id SERIAL,
    libelle VARCHAR(100)
);

CREATE TABLE styleL(
    id SERIAL,
    libelle VARCHAR(100)
);

