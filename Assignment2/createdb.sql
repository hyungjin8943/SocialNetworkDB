--------------------------------------------------------
--  File created - Wednesday-November-06-2013   
--------------------------------------------------------
--------------------------------------------------------
--  DDL for Sequence MDRS_1294F$
--------------------------------------------------------

   CREATE SEQUENCE  "MDRS_1294F$"  MINVALUE 1 MAXVALUE 9999999999999999999999999999 INCREMENT BY 1 START WITH 101 CACHE 100 ORDER  NOCYCLE ;
/
--------------------------------------------------------
--  DDL for Table ADDRESS
--------------------------------------------------------

  CREATE TABLE "ADDRESS" 
   (	"AID" NUMBER, 
	"STREET_NO" NUMBER, 
	"STREET_ADDRESS" VARCHAR2(100), 
	"CITY" VARCHAR2(40), 
	"ZIPCODE" NUMBER, 
	"VERTICE" "SDO_GEOMETRY" 
   ) ;
/
--------------------------------------------------------
--  DDL for Table CITYLOOKUP
--------------------------------------------------------

  CREATE TABLE "CITYLOOKUP" 
   (	"CITY" VARCHAR2(50), 
	"STATE" VARCHAR2(50), 
	"COUNTRY" VARCHAR2(50)
   ) ;
/
--------------------------------------------------------
--  DDL for Table EVENT
--------------------------------------------------------

  CREATE TABLE "EVENT" 
   (	"TITLE" VARCHAR2(100), 
	"DESCRIPTION" VARCHAR2(500), 
	"STARTTIME" DATE, 
	"DURATION" CHAR(50), 
	"AID" NUMBER
   ) ;
/
--------------------------------------------------------
--  DDL for Table FRIENDLOOKUP
--------------------------------------------------------

  CREATE TABLE "FRIENDLOOKUP" 
   (	"FTYPE" NUMBER, 
	"DESCRIPTION" VARCHAR2(50)
   ) ;
/
--------------------------------------------------------
--  DDL for Table FRIENDREQUEST
--------------------------------------------------------

  CREATE TABLE "FRIENDREQUEST" 
   (	"SENDER" VARCHAR2(50), 
	"RECEIVER" VARCHAR2(50), 
	"FTYPE" NUMBER
   ) ;
/
--------------------------------------------------------
--  DDL for Table FRIENDSHIP
--------------------------------------------------------

  CREATE TABLE "FRIENDSHIP" 
   (	"USER1" VARCHAR2(50), 
	"USER2" VARCHAR2(50), 
	"FTYPE" NUMBER
   ) ;
/
--------------------------------------------------------
--  DDL for Table MDRT_1294F$
--------------------------------------------------------

  CREATE TABLE "MDRT_1294F$" 
   (	"NODE_ID" NUMBER, 
	"NODE_LEVEL" NUMBER, 
	"INFO" BLOB
   ) ;
/
--------------------------------------------------------
--  DDL for Table MEMBER
--------------------------------------------------------

  CREATE TABLE "MEMBER" 
   (	"EMAIL" VARCHAR2(50), 
	"BIRTHDATE" DATE, 
	"PASSWORD" VARCHAR2(50), 
	"FNAME" VARCHAR2(50), 
	"LNAME" VARCHAR2(50), 
	"AID" NUMBER
   ) ;
/
--------------------------------------------------------
--  DDL for Table PCOMMENT
--------------------------------------------------------

  CREATE TABLE "PCOMMENT" 
   (	"PID" NUMBER, 
	"TEXT" VARCHAR2(100), 
	"MID" VARCHAR2(50), 
	"DATETIME" DATE
   ) ;
/
--------------------------------------------------------
--  DDL for Table POST
--------------------------------------------------------

  CREATE TABLE "POST" 
   (	"PID" NUMBER, 
	"NOTE" VARCHAR2(500), 
	"SENDER" VARCHAR2(50), 
	"PRIVACY" NUMBER, 
	"DATETIME" DATE
   ) ;
/
REM INSERTING into ADDRESS
SET DEFINE OFF;
Insert into ADDRESS (AID,STREET_NO,STREET_ADDRESS,CITY,ZIPCODE,VERTICE) values (1,655,'W Jefferson','Los Angeles',90007,MDSYS.SDO_GEOMETRY(2001,NULL,MDSYS.SDO_POINT_TYPE(460,434,NULL),NULL,NULL));
Insert into ADDRESS (AID,STREET_NO,STREET_ADDRESS,CITY,ZIPCODE,VERTICE) values (2,8446,'Melrose Pl','Los Angeles',90069,MDSYS.SDO_GEOMETRY(2001,NULL,MDSYS.SDO_POINT_TYPE(165,195,NULL),NULL,NULL));
Insert into ADDRESS (AID,STREET_NO,STREET_ADDRESS,CITY,ZIPCODE,VERTICE) values (3,1300,'E Main St','Alhambra',91801,MDSYS.SDO_GEOMETRY(2001,NULL,MDSYS.SDO_POINT_TYPE(770,165,NULL),NULL,NULL));
Insert into ADDRESS (AID,STREET_NO,STREET_ADDRESS,CITY,ZIPCODE,VERTICE) values (4,3607,'Trousdale Pkwy','Los Angeles',90089,MDSYS.SDO_GEOMETRY(2001,NULL,MDSYS.SDO_POINT_TYPE(450,445,NULL),NULL,NULL));
Insert into ADDRESS (AID,STREET_NO,STREET_ADDRESS,CITY,ZIPCODE,VERTICE) values (5,5757,'Wilshire Blvd','Los Angeles',90036,MDSYS.SDO_GEOMETRY(2001,NULL,MDSYS.SDO_POINT_TYPE(310,277,NULL),NULL,NULL));
Insert into ADDRESS (AID,STREET_NO,STREET_ADDRESS,CITY,ZIPCODE,VERTICE) values (6,1133,' N La Brea Ave','West Hollywood',90038,MDSYS.SDO_GEOMETRY(2001,NULL,MDSYS.SDO_POINT_TYPE(333,157,NULL),NULL,NULL));
Insert into ADDRESS (AID,STREET_NO,STREET_ADDRESS,CITY,ZIPCODE,VERTICE) values (7,3335,'S Figueroa St.','Los Angeles',90007,MDSYS.SDO_GEOMETRY(2001,NULL,MDSYS.SDO_POINT_TYPE(470,430,NULL),NULL,NULL));
Insert into ADDRESS (AID,STREET_NO,STREET_ADDRESS,CITY,ZIPCODE,VERTICE) values (8,2400,'Broadway ','Santa Monica',90404,MDSYS.SDO_GEOMETRY(2001,NULL,MDSYS.SDO_POINT_TYPE(45,407,NULL),NULL,NULL));
Insert into ADDRESS (AID,STREET_NO,STREET_ADDRESS,CITY,ZIPCODE,VERTICE) values (9,2,'Griffith Park','Los Angeles',90027,MDSYS.SDO_GEOMETRY(2001,NULL,MDSYS.SDO_POINT_TYPE(530,345,NULL),NULL,NULL));
Insert into ADDRESS (AID,STREET_NO,STREET_ADDRESS,CITY,ZIPCODE,VERTICE) values (10,405,'Hilgard Avenue','Los Angeles',90095,MDSYS.SDO_GEOMETRY(2001,NULL,MDSYS.SDO_POINT_TYPE(128,246,NULL),NULL,NULL));
Insert into ADDRESS (AID,STREET_NO,STREET_ADDRESS,CITY,ZIPCODE,VERTICE) values (11,1200,'12th Avenue','Los Angeles',90019,MDSYS.SDO_GEOMETRY(2001,NULL,MDSYS.SDO_POINT_TYPE(372,334,NULL),NULL,NULL));
Insert into ADDRESS (AID,STREET_NO,STREET_ADDRESS,CITY,ZIPCODE,VERTICE) values (12,3300,'Wilshire Blvd','Los Angeles',90010,MDSYS.SDO_GEOMETRY(2001,NULL,MDSYS.SDO_POINT_TYPE(429,280,NULL),NULL,NULL));
REM INSERTING into CITYLOOKUP
SET DEFINE OFF;
Insert into CITYLOOKUP (CITY,STATE,COUNTRY) values ('Los Angeles','CA','United States');
Insert into CITYLOOKUP (CITY,STATE,COUNTRY) values ('Alhambra','CA','United States');
Insert into CITYLOOKUP (CITY,STATE,COUNTRY) values ('West Hollywood','CA','United States');
Insert into CITYLOOKUP (CITY,STATE,COUNTRY) values ('Santa Monica','CA','United States');
REM INSERTING into EVENT
SET DEFINE OFF;
Insert into EVENT (TITLE,DESCRIPTION,STARTTIME,DURATION,AID) values ('Tailgate 13','Football & Tailgate Tickets USC Trojans vs. UTAH Utes Saturday, October 26th. Join us for a tailgate three hours prior to kickoff',to_date('13/10/26','RR/MM/DD'),'2 Hours                                           ',5);
Insert into EVENT (TITLE,DESCRIPTION,STARTTIME,DURATION,AID) values ('Superbowl 13','The Super Bowl is the annual championship game of the National Football League (NFL), the highest level of professional American football in the United States, culminating a season that begins in the late summer of the previous calendar year.',to_date('13/12/15','RR/MM/DD'),'4 Hours                                           ',4);
Insert into EVENT (TITLE,DESCRIPTION,STARTTIME,DURATION,AID) values ('NBAFinals 13','The NBA Finals is the championship series of the National Basketball Association. The series was named the NBA World Championship Series until 1986.',to_date('13/01/15','RR/MM/DD'),'3 Hours                                           ',3);
Insert into EVENT (TITLE,DESCRIPTION,STARTTIME,DURATION,AID) values ('Oscars 13','The Academy Awards, now officially known as The Oscars,[1] are a set of awards given annually for excellence of cinematic achievements. The Oscar statuette is officially named the Academy Award of Merit and is one of nine types of Academy Awards.',to_date('13/11/11','RR/MM/DD'),'5 Hours                                           ',3);
Insert into EVENT (TITLE,DESCRIPTION,STARTTIME,DURATION,AID) values ('US OPEN 13','The United States Open Tennis Championships is a hardcourt tennis tournament which is the modern iteration of one of the oldest tennis championships in the world, the U.S. National Championship, for which men''s singles was first contested in 1881.',to_date('13/09/10','RR/MM/DD'),'14 Days                                           ',2);
REM INSERTING into FRIENDLOOKUP
SET DEFINE OFF;
Insert into FRIENDLOOKUP (FTYPE,DESCRIPTION) values (0,'family');
Insert into FRIENDLOOKUP (FTYPE,DESCRIPTION) values (1,'close friend');
Insert into FRIENDLOOKUP (FTYPE,DESCRIPTION) values (2,'regular friend');
REM INSERTING into FRIENDREQUEST
SET DEFINE OFF;
Insert into FRIENDREQUEST (SENDER,RECEIVER,FTYPE) values ('brad@csci585.edu','nelle@csci585.edu',2);
Insert into FRIENDREQUEST (SENDER,RECEIVER,FTYPE) values ('al@csci585.edu','kim@csci585.edu',1);
REM INSERTING into FRIENDSHIP
SET DEFINE OFF;
Insert into FRIENDSHIP (USER1,USER2,FTYPE) values ('angelina@csci585.edu','brad@csci585.edu',0);
Insert into FRIENDSHIP (USER1,USER2,FTYPE) values ('angelina@csci585.edu','al@csci585.edu',1);
Insert into FRIENDSHIP (USER1,USER2,FTYPE) values ('angelina@csci585.edu','nelle@csci585.edu',2);
Insert into FRIENDSHIP (USER1,USER2,FTYPE) values ('angelina@csci585.edu','zzhang@csci585.edu',2);
Insert into FRIENDSHIP (USER1,USER2,FTYPE) values ('angelina@csci585.edu','niki@csci585.edu',2);
Insert into FRIENDSHIP (USER1,USER2,FTYPE) values ('brad@csci585.edu','nelle@csci585.edu',1);
Insert into FRIENDSHIP (USER1,USER2,FTYPE) values ('brad@csci585.edu','hope@csci585.edu',2);
Insert into FRIENDSHIP (USER1,USER2,FTYPE) values ('brad@csci585.edu','haung@usc.edu',2);
Insert into FRIENDSHIP (USER1,USER2,FTYPE) values ('al@csci585.edu','andre@csci585.edu',1);
Insert into FRIENDSHIP (USER1,USER2,FTYPE) values ('steve@csci585.edu','bill@csci585.edu',1);
Insert into FRIENDSHIP (USER1,USER2,FTYPE) values ('steve@csci585.edu','tina@csci585.edu',2);
Insert into FRIENDSHIP (USER1,USER2,FTYPE) values ('serina@usc.edu','venus@csci585.edu',0);
Insert into FRIENDSHIP (USER1,USER2,FTYPE) values ('andre@csci585.edu','fan@csci585.edu',2);
Insert into FRIENDSHIP (USER1,USER2,FTYPE) values ('nelle@csci585.edu','had@csci585.edu',2);
Insert into FRIENDSHIP (USER1,USER2,FTYPE) values ('nelle@csci585.edu','jen@csci585.edu',1);
Insert into FRIENDSHIP (USER1,USER2,FTYPE) values ('pit@csci585.edu','venus@csci585.edu',1);
Insert into FRIENDSHIP (USER1,USER2,FTYPE) values ('josh@csci585.edu','jakie@csci585.edu',2);
Insert into FRIENDSHIP (USER1,USER2,FTYPE) values ('josh@csci585.edu','nelle@csci585.edu',1);
Insert into FRIENDSHIP (USER1,USER2,FTYPE) values ('josh@csci585.edu','kamal@csci585.edu',1);
Insert into FRIENDSHIP (USER1,USER2,FTYPE) values ('josh@csci585.edu','niki@csci585.edu',2);
Insert into FRIENDSHIP (USER1,USER2,FTYPE) values ('josh@csci585.edu','son@csci585.edu',2);
Insert into FRIENDSHIP (USER1,USER2,FTYPE) values ('serina@usc.edu','tom@csci585.edu',2);
Insert into FRIENDSHIP (USER1,USER2,FTYPE) values ('jay@csci585.edu','andy@csci585.edu',2);
Insert into FRIENDSHIP (USER1,USER2,FTYPE) values ('son@csci585.edu','tom@csci585.edu',2);
Insert into FRIENDSHIP (USER1,USER2,FTYPE) values ('urm@csci585.edu','kim@csci585.edu',1);
Insert into FRIENDSHIP (USER1,USER2,FTYPE) values ('niki@csci585.edu','bbahram@csci585.edu',1);
Insert into FRIENDSHIP (USER1,USER2,FTYPE) values ('niki@csci585.edu','had@csci585.edu',1);
Insert into FRIENDSHIP (USER1,USER2,FTYPE) values ('bbahram@csci585.edu','tina@csci585.edu',1);
Insert into FRIENDSHIP (USER1,USER2,FTYPE) values ('son@csci585.edu','kim@csci585.edu',2);
Insert into FRIENDSHIP (USER1,USER2,FTYPE) values ('deena@csci585.edu','mani@csci585.edu',2);
Insert into FRIENDSHIP (USER1,USER2,FTYPE) values ('miley@csci585.edu','pit@csci585.edu',2);
Insert into FRIENDSHIP (USER1,USER2,FTYPE) values ('jen@csci585.edu','jakie@csci585.edu',2);
Insert into FRIENDSHIP (USER1,USER2,FTYPE) values ('bbahram@csci585.edu','angelina@csci585.edu',2);
REM INSERTING into MDRT_1294F$
SET DEFINE OFF;
Insert into MDRT_1294F$ (NODE_ID,NODE_LEVEL) values (1,1);
Insert into MDRT_1294F$ (NODE_ID,NODE_LEVEL) values (1,2);
REM INSERTING into MEMBER
SET DEFINE OFF;
Insert into MEMBER (EMAIL,BIRTHDATE,PASSWORD,FNAME,LNAME,AID) values ('angelina@csci585.edu',to_date('75/06/04','RR/MM/DD'),'123456','Angelina','Jolie',1);
Insert into MEMBER (EMAIL,BIRTHDATE,PASSWORD,FNAME,LNAME,AID) values ('brad@csci585.edu',to_date('63/12/18','RR/MM/DD'),'123456','Brad','Pitt',1);
Insert into MEMBER (EMAIL,BIRTHDATE,PASSWORD,FNAME,LNAME,AID) values ('al@csci585.edu',to_date('70/04/25','RR/MM/DD'),'123456','Alfredo','Pacino',3);
Insert into MEMBER (EMAIL,BIRTHDATE,PASSWORD,FNAME,LNAME,AID) values ('steve@csci585.edu',to_date('55/02/24','RR/MM/DD'),'123456','Steve','Jobs',2);
Insert into MEMBER (EMAIL,BIRTHDATE,PASSWORD,FNAME,LNAME,AID) values ('bill@csci585.edu',to_date('55/10/28','RR/MM/DD'),'123456','Bill','Gates',2);
Insert into MEMBER (EMAIL,BIRTHDATE,PASSWORD,FNAME,LNAME,AID) values ('miley@csci585.edu',to_date('92/11/23','RR/MM/DD'),'123456','Miley','Cyrus',6);
Insert into MEMBER (EMAIL,BIRTHDATE,PASSWORD,FNAME,LNAME,AID) values ('hope@csci585.edu',to_date('81/07/20','RR/MM/DD'),'123456','Hope','Solo',2);
Insert into MEMBER (EMAIL,BIRTHDATE,PASSWORD,FNAME,LNAME,AID) values ('andre@csci585.edu',to_date('70/04/29','RR/MM/DD'),'123456','Andre','Agassi',8);
Insert into MEMBER (EMAIL,BIRTHDATE,PASSWORD,FNAME,LNAME,AID) values ('nelle@csci585.edu',to_date('55/09/12','RR/MM/DD'),'123456','Nelle','Lee',2);
Insert into MEMBER (EMAIL,BIRTHDATE,PASSWORD,FNAME,LNAME,AID) values ('jen@csci585.edu',to_date('69/02/11','RR/MM/DD'),'123456','Jennifer','Aniston',5);
Insert into MEMBER (EMAIL,BIRTHDATE,PASSWORD,FNAME,LNAME,AID) values ('pit@csci585.edu',to_date('71/08/12','RR/MM/DD'),'123456','Pit','Sampras',5);
Insert into MEMBER (EMAIL,BIRTHDATE,PASSWORD,FNAME,LNAME,AID) values ('josh@csci585.edu',to_date('74/07/29','RR/MM/DD'),'123456','Josh','Radnor',5);
Insert into MEMBER (EMAIL,BIRTHDATE,PASSWORD,FNAME,LNAME,AID) values ('tom@csci585.edu',to_date('62/07/03','RR/MM/DD'),'123456','Tom','Cruise',4);
Insert into MEMBER (EMAIL,BIRTHDATE,PASSWORD,FNAME,LNAME,AID) values ('serina@usc.edu',to_date('81/09/26','RR/MM/DD'),'123456','Serena','Williams',4);
Insert into MEMBER (EMAIL,BIRTHDATE,PASSWORD,FNAME,LNAME,AID) values ('venus@csci585.edu',to_date('89/06/17','RR/MM/DD'),'123456','Venus','Williams',3);
Insert into MEMBER (EMAIL,BIRTHDATE,PASSWORD,FNAME,LNAME,AID) values ('fan@csci585.edu',to_date('81/09/16','RR/MM/DD'),'123456','Fan','Bingbing',7);
Insert into MEMBER (EMAIL,BIRTHDATE,PASSWORD,FNAME,LNAME,AID) values ('jay@csci585.edu',to_date('79/01/18','RR/MM/DD'),'123456','Jay','Chou',7);
Insert into MEMBER (EMAIL,BIRTHDATE,PASSWORD,FNAME,LNAME,AID) values ('jakie@csci585.edu',to_date('54/04/07','RR/MM/DD'),'123456','Jackie','Chan',6);
Insert into MEMBER (EMAIL,BIRTHDATE,PASSWORD,FNAME,LNAME,AID) values ('andy@csci585.edu',to_date('61/09/27','RR/MM/DD'),'123456','Andy','Lau',10);
Insert into MEMBER (EMAIL,BIRTHDATE,PASSWORD,FNAME,LNAME,AID) values ('zzhang@csci585.edu',to_date('79/02/09','RR/MM/DD'),'123456','Zhang','Ziyi',8);
Insert into MEMBER (EMAIL,BIRTHDATE,PASSWORD,FNAME,LNAME,AID) values ('haung@usc.edu',to_date('77/11/13','RR/MM/DD'),'123456','Haung','Xiaoming',10);
Insert into MEMBER (EMAIL,BIRTHDATE,PASSWORD,FNAME,LNAME,AID) values ('son@csci585.edu',to_date('94/05/28','RR/MM/DD'),'123456','Yeon-Jae','Son',9);
Insert into MEMBER (EMAIL,BIRTHDATE,PASSWORD,FNAME,LNAME,AID) values ('kim@csci585.edu',to_date('88/02/16','RR/MM/DD'),'123456','Soo-Hyun','Kim',9);
Insert into MEMBER (EMAIL,BIRTHDATE,PASSWORD,FNAME,LNAME,AID) values ('urm@csci585.edu',to_date('74/02/04','RR/MM/DD'),'123456','Urmila ','Matondkar',9);
Insert into MEMBER (EMAIL,BIRTHDATE,PASSWORD,FNAME,LNAME,AID) values ('kamal@csci585.edu',to_date('54/11/07','RR/MM/DD'),'123456','Kamal','Hassan',11);
Insert into MEMBER (EMAIL,BIRTHDATE,PASSWORD,FNAME,LNAME,AID) values ('mani@csci585.edu',to_date('70/08/16','RR/MM/DD'),'123456','Manisha ','Koirala',11);
Insert into MEMBER (EMAIL,BIRTHDATE,PASSWORD,FNAME,LNAME,AID) values ('niki@csci585.edu',to_date('71/11/10','RR/MM/DD'),'123456','Niki','Karimi',3);
Insert into MEMBER (EMAIL,BIRTHDATE,PASSWORD,FNAME,LNAME,AID) values ('bbahram@csci585.edu',to_date('79/04/28','RR/MM/DD'),'123456','Bahram','Radan',11);
Insert into MEMBER (EMAIL,BIRTHDATE,PASSWORD,FNAME,LNAME,AID) values ('had@csci585.edu',to_date('79/01/01','RR/MM/DD'),'123456','Hadis','Fouladvand',12);
Insert into MEMBER (EMAIL,BIRTHDATE,PASSWORD,FNAME,LNAME,AID) values ('tina@csci585.edu',to_date('92/10/22','RR/MM/DD'),'123456','Tina','Verma',6);
Insert into MEMBER (EMAIL,BIRTHDATE,PASSWORD,FNAME,LNAME,AID) values ('deena@csci585.edu',to_date('89/02/04','RR/MM/DD'),'123456','Deena','Gandhi',12);
REM INSERTING into PCOMMENT
SET DEFINE OFF;
Insert into PCOMMENT (PID,TEXT,MID,DATETIME) values (1,'GREAT!','andre@csci585.edu',to_date('13/09/14','RR/MM/DD'));
Insert into PCOMMENT (PID,TEXT,MID,DATETIME) values (3,'GREAT!','andre@csci585.edu',to_date('13/09/14','RR/MM/DD'));
Insert into PCOMMENT (PID,TEXT,MID,DATETIME) values (5,'GREAT!','andre@csci585.edu',to_date('13/09/14','RR/MM/DD'));
Insert into PCOMMENT (PID,TEXT,MID,DATETIME) values (7,'GREAT!','andre@csci585.edu',to_date('13/09/14','RR/MM/DD'));
Insert into PCOMMENT (PID,TEXT,MID,DATETIME) values (1,'GREAT!','brad@csci585.edu',to_date('13/09/14','RR/MM/DD'));
Insert into PCOMMENT (PID,TEXT,MID,DATETIME) values (3,'AWESOME!','brad@csci585.edu',to_date('13/09/14','RR/MM/DD'));
Insert into PCOMMENT (PID,TEXT,MID,DATETIME) values (5,'AWESOME!','brad@csci585.edu',to_date('13/09/14','RR/MM/DD'));
Insert into PCOMMENT (PID,TEXT,MID,DATETIME) values (7,'AWESOME!','brad@csci585.edu',to_date('13/09/14','RR/MM/DD'));
Insert into PCOMMENT (PID,TEXT,MID,DATETIME) values (1,'AWESOME!','steve@csci585.edu',to_date('13/09/14','RR/MM/DD'));
Insert into PCOMMENT (PID,TEXT,MID,DATETIME) values (3,'AWESOME!','steve@csci585.edu',to_date('13/09/14','RR/MM/DD'));
Insert into PCOMMENT (PID,TEXT,MID,DATETIME) values (5,'AMAZING!','steve@csci585.edu',to_date('13/09/14','RR/MM/DD'));
Insert into PCOMMENT (PID,TEXT,MID,DATETIME) values (7,'AMAZING!','steve@csci585.edu',to_date('13/09/14','RR/MM/DD'));
Insert into PCOMMENT (PID,TEXT,MID,DATETIME) values (1,'AMAZING!','niki@csci585.edu',to_date('13/09/14','RR/MM/DD'));
Insert into PCOMMENT (PID,TEXT,MID,DATETIME) values (3,'AMAZING!','niki@csci585.edu',to_date('13/09/14','RR/MM/DD'));
Insert into PCOMMENT (PID,TEXT,MID,DATETIME) values (5,'AMAZING!','niki@csci585.edu',to_date('13/09/14','RR/MM/DD'));
Insert into PCOMMENT (PID,TEXT,MID,DATETIME) values (7,'AMAZING!','niki@csci585.edu',to_date('13/09/14','RR/MM/DD'));
Insert into PCOMMENT (PID,TEXT,MID,DATETIME) values (1,'REALLY?','haung@usc.edu',to_date('13/09/14','RR/MM/DD'));
Insert into PCOMMENT (PID,TEXT,MID,DATETIME) values (3,'REALLY?','haung@usc.edu',to_date('13/09/14','RR/MM/DD'));
Insert into PCOMMENT (PID,TEXT,MID,DATETIME) values (5,'REALLY?','haung@usc.edu',to_date('13/09/14','RR/MM/DD'));
Insert into PCOMMENT (PID,TEXT,MID,DATETIME) values (7,'REALLY?','haung@usc.edu',to_date('13/09/14','RR/MM/DD'));
Insert into PCOMMENT (PID,TEXT,MID,DATETIME) values (1,'REALLY?','kamal@csci585.edu',to_date('13/09/14','RR/MM/DD'));
Insert into PCOMMENT (PID,TEXT,MID,DATETIME) values (3,'REALLY?','kamal@csci585.edu',to_date('13/09/14','RR/MM/DD'));
Insert into PCOMMENT (PID,TEXT,MID,DATETIME) values (5,'COOL!','kamal@csci585.edu',to_date('13/09/14','RR/MM/DD'));
Insert into PCOMMENT (PID,TEXT,MID,DATETIME) values (7,'COOL!','kamal@csci585.edu',to_date('13/09/14','RR/MM/DD'));
Insert into PCOMMENT (PID,TEXT,MID,DATETIME) values (2,'COOL!','al@csci585.edu',to_date('13/09/14','RR/MM/DD'));
Insert into PCOMMENT (PID,TEXT,MID,DATETIME) values (4,'COOL!','had@csci585.edu',to_date('13/09/14','RR/MM/DD'));
Insert into PCOMMENT (PID,TEXT,MID,DATETIME) values (6,'COOL!','angelina@csci585.edu',to_date('13/09/14','RR/MM/DD'));
Insert into PCOMMENT (PID,TEXT,MID,DATETIME) values (8,'COOL!','son@csci585.edu',to_date('13/09/14','RR/MM/DD'));
Insert into PCOMMENT (PID,TEXT,MID,DATETIME) values (10,'COOL!','jay@csci585.edu',to_date('13/09/14','RR/MM/DD'));
Insert into PCOMMENT (PID,TEXT,MID,DATETIME) values (2,'COOL!','nelle@csci585.edu',to_date('13/09/14','RR/MM/DD'));
REM INSERTING into POST
SET DEFINE OFF;
Insert into POST (PID,NOTE,SENDER,PRIVACY,DATETIME) values (1,'"What''s something that adults do that they shouldn''t do?"
"Punish kids. And war."','angelina@csci585.edu',2,to_date('13/09/14','RR/MM/DD'));
Insert into POST (PID,NOTE,SENDER,PRIVACY,DATETIME) values (2,'"I''m from the Ivory Coast."
"Why''d you come to America?"
He formed his hands into two imaginary guns. "Too much boom boom," he said. "So I run."','angelina@csci585.edu',1,to_date('13/09/14','RR/MM/DD'));
Insert into POST (PID,NOTE,SENDER,PRIVACY,DATETIME) values (3,'"What was the happiest moment of your life?"
"Any time I wake up and nothing hurts."','brad@csci585.edu',2,to_date('13/09/14','RR/MM/DD'));
Insert into POST (PID,NOTE,SENDER,PRIVACY,DATETIME) values (4,'"Everyone loves me. I go everywhere, and I don''t fight with nobody. If somebody''s yelling at me, I just keep walking. I''ve only been in one fight. I used to be a taxi driver. ','nelle@csci585.edu',1,to_date('13/09/14','RR/MM/DD'));
Insert into POST (PID,NOTE,SENDER,PRIVACY,DATETIME) values (5,'"I had this idea to make a portrait, and instead of filling it in with physical features, I filled it in with the verbs that each body part can do."','niki@csci585.edu',2,to_date('13/09/14','RR/MM/DD'));
Insert into POST (PID,NOTE,SENDER,PRIVACY,DATETIME) values (6,'"My dad is big and strong and lifts the heavy weights at the gym. He also is a fireman and he once saved eleven people."','bbahram@csci585.edu',1,to_date('13/09/14','RR/MM/DD'));
Insert into POST (PID,NOTE,SENDER,PRIVACY,DATETIME) values (7,'"If you could give one piece of advice to a large group of people, what would it be?"
"Be optimistic."','had@csci585.edu',2,to_date('13/09/14','RR/MM/DD'));
Insert into POST (PID,NOTE,SENDER,PRIVACY,DATETIME) values (8,'Today in microfashion...','kim@csci585.edu',1,to_date('13/09/14','RR/MM/DD'));
Insert into POST (PID,NOTE,SENDER,PRIVACY,DATETIME) values (9,'"If you could give one piece of advice to a large group of people, what would it be?"
"Enjoy it while it lasts."','zzhang@csci585.edu',0,to_date('13/09/14','RR/MM/DD'));
Insert into POST (PID,NOTE,SENDER,PRIVACY,DATETIME) values (10,'"I''m breaking out of my shell."','andy@csci585.edu',1,to_date('13/09/14','RR/MM/DD'));
--------------------------------------------------------
--  DDL for Index ADDRESS_PK
--------------------------------------------------------
 INSERT INTO USER_SDO_GEOM_METADATA
 values('ADDRESS','vertice',
 SDO_DIM_ARRAY(SDO_DIM_ELEMENT('x',0,100,1),
 SDO_DIM_ELEMENT('Y',0,100,1)),NULL);
 
 create index index_ADDRESS on ADDRESS(vertice) indextype is MDSYS.SPATIAL_INDEX; 
 
  CREATE UNIQUE INDEX "ADDRESS_PK" ON "ADDRESS" ("AID") 
  ;
/
--------------------------------------------------------
--  DDL for Index CITYLOOKUP_PK
--------------------------------------------------------

  CREATE UNIQUE INDEX "CITYLOOKUP_PK" ON "CITYLOOKUP" ("CITY") 
  ;
/
--------------------------------------------------------
--  DDL for Index EVENT_PK
--------------------------------------------------------

  CREATE UNIQUE INDEX "EVENT_PK" ON "EVENT" ("TITLE") 
  ;
/
--------------------------------------------------------
--  DDL for Index FRIENDLOOKUP_PK
--------------------------------------------------------

  CREATE UNIQUE INDEX "FRIENDLOOKUP_PK" ON "FRIENDLOOKUP" ("FTYPE") 
  ;
/
--------------------------------------------------------
--  DDL for Index FRIENDREQUEST_PK
--------------------------------------------------------

  CREATE UNIQUE INDEX "FRIENDREQUEST_PK" ON "FRIENDREQUEST" ("SENDER", "RECEIVER") 
  ;
/
--------------------------------------------------------
--  DDL for Index FRIENDSHIP_PK
--------------------------------------------------------

  CREATE UNIQUE INDEX "FRIENDSHIP_PK" ON "FRIENDSHIP" ("USER1", "USER2") 
  ;
/
--------------------------------------------------------
--  DDL for Index INDEX_ADDRESS
--------------------------------------------------------

/
--------------------------------------------------------
--  DDL for Index MEMBER_PK
--------------------------------------------------------

  CREATE UNIQUE INDEX "MEMBER_PK" ON "MEMBER" ("EMAIL") 
  ;
/
--------------------------------------------------------
--  DDL for Index PCOMMENT_PK
--------------------------------------------------------

  CREATE UNIQUE INDEX "PCOMMENT_PK" ON "PCOMMENT" ("PID", "MID") 
  ;
/
--------------------------------------------------------
--  DDL for Index POST_PK
--------------------------------------------------------

  CREATE UNIQUE INDEX "POST_PK" ON "POST" ("PID") 
  ;
/
--------------------------------------------------------
--  Constraints for Table ADDRESS
--------------------------------------------------------

  ALTER TABLE "ADDRESS" ADD CONSTRAINT "ADDRESS_PK" PRIMARY KEY ("AID") ENABLE;
 
  ALTER TABLE "ADDRESS" MODIFY ("AID" NOT NULL ENABLE);
/
--------------------------------------------------------
--  Constraints for Table CITYLOOKUP
--------------------------------------------------------

  ALTER TABLE "CITYLOOKUP" ADD CONSTRAINT "CITYLOOKUP_PK" PRIMARY KEY ("CITY") ENABLE;
 
  ALTER TABLE "CITYLOOKUP" MODIFY ("CITY" NOT NULL ENABLE);
/
--------------------------------------------------------
--  Constraints for Table EVENT
--------------------------------------------------------

  ALTER TABLE "EVENT" ADD CONSTRAINT "EVENT_PK" PRIMARY KEY ("TITLE") ENABLE;
 
  ALTER TABLE "EVENT" MODIFY ("TITLE" NOT NULL ENABLE);
/
--------------------------------------------------------
--  Constraints for Table FRIENDLOOKUP
--------------------------------------------------------

  ALTER TABLE "FRIENDLOOKUP" ADD CONSTRAINT "FRIENDLOOKUP_PK" PRIMARY KEY ("FTYPE") ENABLE;
 
  ALTER TABLE "FRIENDLOOKUP" MODIFY ("FTYPE" NOT NULL ENABLE);
/
--------------------------------------------------------
--  Constraints for Table FRIENDREQUEST
--------------------------------------------------------

  ALTER TABLE "FRIENDREQUEST" ADD CONSTRAINT "FRIENDREQUEST_PK" PRIMARY KEY ("SENDER", "RECEIVER") ENABLE;
 
  ALTER TABLE "FRIENDREQUEST" MODIFY ("SENDER" NOT NULL ENABLE);
 
  ALTER TABLE "FRIENDREQUEST" MODIFY ("RECEIVER" NOT NULL ENABLE);
/
--------------------------------------------------------
--  Constraints for Table FRIENDSHIP
--------------------------------------------------------

  ALTER TABLE "FRIENDSHIP" ADD CONSTRAINT "FRIENDSHIP_PK" PRIMARY KEY ("USER1", "USER2") ENABLE;
 
  ALTER TABLE "FRIENDSHIP" MODIFY ("USER1" NOT NULL ENABLE);
 
  ALTER TABLE "FRIENDSHIP" MODIFY ("USER2" NOT NULL ENABLE);
/
--------------------------------------------------------
--  Constraints for Table MEMBER
--------------------------------------------------------

  ALTER TABLE "MEMBER" ADD CONSTRAINT "MEMBER_PK" PRIMARY KEY ("EMAIL") ENABLE;
 
  ALTER TABLE "MEMBER" MODIFY ("EMAIL" NOT NULL ENABLE);
/
--------------------------------------------------------
--  Constraints for Table PCOMMENT
--------------------------------------------------------

  ALTER TABLE "PCOMMENT" ADD CONSTRAINT "PCOMMENT_PK" PRIMARY KEY ("PID", "MID") ENABLE;
 
  ALTER TABLE "PCOMMENT" MODIFY ("PID" NOT NULL ENABLE);
 
  ALTER TABLE "PCOMMENT" MODIFY ("MID" NOT NULL ENABLE);
/
--------------------------------------------------------
--  Constraints for Table POST
--------------------------------------------------------

  ALTER TABLE "POST" ADD CONSTRAINT "POST_PK" PRIMARY KEY ("PID") ENABLE;
 
  ALTER TABLE "POST" MODIFY ("PID" NOT NULL ENABLE);
/
--------------------------------------------------------
--  Ref Constraints for Table FRIENDREQUEST
--------------------------------------------------------

  ALTER TABLE "FRIENDREQUEST" ADD CONSTRAINT "FRIENDREQUEST_FRIENDLOOKU_FK1" FOREIGN KEY ("FTYPE")
	  REFERENCES "FRIENDLOOKUP" ("FTYPE") ON DELETE CASCADE ENABLE;
 
  ALTER TABLE "FRIENDREQUEST" ADD CONSTRAINT "FRIENDREQUEST_MEMBER_FK1" FOREIGN KEY ("SENDER")
	  REFERENCES "MEMBER" ("EMAIL") ON DELETE CASCADE ENABLE;
 
  ALTER TABLE "FRIENDREQUEST" ADD CONSTRAINT "FRIENDREQUEST_MEMBER_FK2" FOREIGN KEY ("RECEIVER")
	  REFERENCES "MEMBER" ("EMAIL") ON DELETE CASCADE ENABLE;
/
--------------------------------------------------------
--  Ref Constraints for Table FRIENDSHIP
--------------------------------------------------------

  ALTER TABLE "FRIENDSHIP" ADD CONSTRAINT "FRIENDSHIP_FRIENDLOOKUP_FK1" FOREIGN KEY ("FTYPE")
	  REFERENCES "FRIENDLOOKUP" ("FTYPE") ON DELETE CASCADE ENABLE;
 
  ALTER TABLE "FRIENDSHIP" ADD CONSTRAINT "FRIENDSHIP_MEMBER_FK1" FOREIGN KEY ("USER1")
	  REFERENCES "MEMBER" ("EMAIL") ON DELETE CASCADE ENABLE;
 
  ALTER TABLE "FRIENDSHIP" ADD CONSTRAINT "FRIENDSHIP_MEMBER_FK2" FOREIGN KEY ("USER2")
	  REFERENCES "MEMBER" ("EMAIL") ON DELETE CASCADE ENABLE;
/
--------------------------------------------------------
--  Ref Constraints for Table MEMBER
--------------------------------------------------------

  ALTER TABLE "MEMBER" ADD CONSTRAINT "MEMBER_ADDRESS_FK1" FOREIGN KEY ("AID")
	  REFERENCES "ADDRESS" ("AID") ON DELETE CASCADE ENABLE;
/
--------------------------------------------------------
--  Ref Constraints for Table PCOMMENT
--------------------------------------------------------

  ALTER TABLE "PCOMMENT" ADD CONSTRAINT "PCOMMENT_MEMBER_FK1" FOREIGN KEY ("MID")
	  REFERENCES "MEMBER" ("EMAIL") ON DELETE CASCADE ENABLE;
 
  ALTER TABLE "PCOMMENT" ADD CONSTRAINT "PCOMMENT_POST_FK1" FOREIGN KEY ("PID")
	  REFERENCES "POST" ("PID") ON DELETE CASCADE ENABLE;
/
--------------------------------------------------------
--  Ref Constraints for Table POST
--------------------------------------------------------

  ALTER TABLE "POST" ADD CONSTRAINT "POST_MEMBER_FK1" FOREIGN KEY ("SENDER")
	  REFERENCES "MEMBER" ("EMAIL") ON DELETE CASCADE ENABLE;
/
