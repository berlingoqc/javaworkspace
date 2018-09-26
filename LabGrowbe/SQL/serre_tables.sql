/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  william
 * Created: 14-Sep-2018
 */

	CREATE TABLE IF NOT EXISTS websocketinfo(
		serreid int not null,
		ssid varchar(100),
		lastip varchar(15),

                PRIMARY KEY(serreid)
	);

	CREATE TABLE IF NOT EXISTS registerhub(
		id int not null,
		name varchar(50),
		emplacement varchar(50),
		communicationmode int,
		status	int
	);

	CREATE TABLE IF NOT EXISTS settingshub(
		id INTEGER PRIMARY KEY,
		ifinterface BLOB,
		software BLOB,
		plateform BLOB,
		mode BLOB
	);

	CREATE TABLE IF NOT EXISTS registerserre(
		id INTEGER PRIMARY KEY,
		hubid TEXT,
		name TEXT,
		state INTEGER,
		mode INTEGER,
		port INTEGER
	);

	CREATE TABLE IF NOT EXISTS settingsserre(
		id INTEGER PRIMARY KEY,
		manifold BLOB,
		light BLOB,
		air BLOB,
		water BLOB,
		hub BLOB,
		relay BLOB
	);

	CREATE TABLE IF NOT EXISTS culture(
		serreid INTEGER PRIMARY KEY,
		startedDate REAL,
		culturestate INTEGER,
		expectedTimeGrowing INTEGER,
		expectedTimeFlowering INTEGER,
		profilgrowing BLOB,
		profilflowering BLOB
	);
	
	CREATE TABLE IF NOT EXISTS datareport(
		datetime REAL,
		serreid INTEGER,
		report BLOB,
		PRIMARY KEY (datetime, serreid)
	);

	CREATE TABLE IF NOT EXISTS errors(
		datetime REAL,
		serreid INTEGER,
		err BLOB,
		PRIMARY KEY (datetime,serreid)
	);
