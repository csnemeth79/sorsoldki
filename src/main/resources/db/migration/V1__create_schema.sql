CREATE TABLE USER_INFO (
	ID BIGINT GENERATED BY DEFAULT AS IDENTITY,
	EMAIL varchar(255) not null,
	DISPLAY_NAME varchar(255) not null
);

CREATE TABLE LOTTERY (
	ID BIGINT GENERATED BY DEFAULT AS IDENTITY,
	NAME varchar(255) not null
);