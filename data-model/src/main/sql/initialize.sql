--create schema
create schema hockey;

--create tables
create table hockey.team (
    team_id serial primary key,
    team_name varchar(255)
);

create table hockey.rink (
    rink_id serial primary key,
    rink_name varchar(255)
);

create table hockey.sheet (
    sheet_id serial primary key,
    sheet_name varchar(255),
    rink_id integer references hockey.rink (rink_id)
);

create table hockey.season (
    season_id serial primary key,
    season_name varchar(255),
    season_start_date date,
    season_end_date date
);

create table hockey.schedule (
    schedule_id serial primary key,
    home_team_id integer references hockey.team (team_id),
    away_team_id integer references hockey.team (team_id),
    start_time timestamptz,
    season_id integer references hockey.season (season_id)
);

--create records
insert into hockey.team
    (team_name)
values
    ('Blowholes'),
    ('Moose'),
    ('Bad Brew'),
    ('Ice Turtles'),
    ('Larrys'),
    ('Panthers'),
    ('Collision Experts'),
    ('Red Army');

insert into hockey.rink
    (rink_name)
VALUES
    ('Rockville');

insert into hockey.sheet
    (sheet_name, rink_id)
VALUES
    ('Rink 1', (select rink_id from hockey.rink where rink_name = 'Rockville')),
    ('Rink 2', (select rink_id from hockey.rink where rink_name = 'Rockville')),
    ('Rink 3', (select rink_id from hockey.rink where rink_name = 'Rockville'));

insert into hockey.season
    (season_name, season_start_date, season_end_date)
VALUES
    ('Winter 2016', '2016-09-15', '2017-03-17');

commit;

