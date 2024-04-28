-- MySQL dump 10.13  Distrib 8.0.36, for Linux (x86_64)
--
-- Host: localhost    Database: gestion
-- ------------------------------------------------------
-- Server version	8.0.36-0ubuntu0.22.04.1

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `Administrateurs`
--

DROP TABLE IF EXISTS `Administrateurs`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Administrateurs` (
  `idA` int NOT NULL,
  `nom` varchar(50) DEFAULT NULL,
  `prenom` varchar(100) DEFAULT NULL,
  `tel` int DEFAULT NULL,
  PRIMARY KEY (`idA`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Administrateurs`
--

LOCK TABLES `Administrateurs` WRITE;
/*!40000 ALTER TABLE `Administrateurs` DISABLE KEYS */;
/*!40000 ALTER TABLE `Administrateurs` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Etudiant`
--

DROP TABLE IF EXISTS `Etudiant`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Etudiant` (
  `idE` int NOT NULL,
  `nom` varchar(50) DEFAULT NULL,
  `prenom` varchar(30) DEFAULT NULL,
  `adresse` varchar(100) DEFAULT NULL,
  `email` varchar(10) DEFAULT NULL,
  `tel` int DEFAULT NULL,
  PRIMARY KEY (`idE`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Etudiant`
--

LOCK TABLES `Etudiant` WRITE;
/*!40000 ALTER TABLE `Etudiant` DISABLE KEYS */;
/*!40000 ALTER TABLE `Etudiant` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cours`
--

DROP TABLE IF EXISTS `cours`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cours` (
  `nom` varchar(50) DEFAULT NULL,
  `salle` int DEFAULT NULL,
  `heure` int DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cours`
--

LOCK TABLES `cours` WRITE;
/*!40000 ALTER TABLE `cours` DISABLE KEYS */;
/*!40000 ALTER TABLE `cours` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `note`
--

DROP TABLE IF EXISTS `note`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `note` (
  `apreciation` varchar(10) DEFAULT NULL,
  `matiere` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `note`
--

LOCK TABLES `note` WRITE;
/*!40000 ALTER TABLE `note` DISABLE KEYS */;
/*!40000 ALTER TABLE `note` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-04-28  1:34:20





mysql> use gestion;
Reading table information for completion of table and column names
You can turn off this feature to get a quicker startup with -A

Database changed

mysql> desc Etudiant;
+---------+--------------+------+-----+---------+-------+
| Field   | Type         | Null | Key | Default | Extra |
+---------+--------------+------+-----+---------+-------+
| idE     | int          | NO   | PRI | NULL    |       |
| nom     | varchar(50)  | YES  |     | NULL    |       |
| prenom  | varchar(30)  | YES  |     | NULL    |       |
| adresse | varchar(100) | YES  |     | NULL    |       |
| email   | varchar(10)  | YES  |     | NULL    |       |
| tel     | int          | YES  |     | NULL    |       |
+---------+--------------+------+-----+---------+-------+
6 rows in set (0,01 sec)

mysql> desc Administrateurs;
+--------+--------------+------+-----+---------+-------+
| Field  | Type         | Null | Key | Default | Extra |
+--------+--------------+------+-----+---------+-------+
| idA    | int          | NO   | PRI | NULL    |       |
| nom    | varchar(50)  | YES  |     | NULL    |       |
| prenom | varchar(100) | YES  |     | NULL    |       |
| tel    | int          | YES  |     | NULL    |       |
+--------+--------------+------+-----+---------+-------+
4 rows in set (0,00 sec)

mysql> desc note;
+-------------+-------------+------+-----+---------+-------+
| Field       | Type        | Null | Key | Default | Extra |
+-------------+-------------+------+-----+---------+-------+
| apreciation | varchar(10) | YES  |     | NULL    |       |
| matiere     | varchar(50) | YES  |     | NULL    |       |
+-------------+-------------+------+-----+---------+-------+
2 rows in set (0,01 sec)

mysql> desc cours;
+-------+-------------+------+-----+---------+-------+
| Field | Type        | Null | Key | Default | Extra |
+-------+-------------+------+-----+---------+-------+
| nom   | varchar(50) | YES  |     | NULL    |       |
| salle | int         | YES  |     | NULL    |       |
| heure | int         | YES  |     | NULL    |       |
+-------+-------------+------+-----+---------+-------+
3 rows in set (0,00 sec)

mysql> 



