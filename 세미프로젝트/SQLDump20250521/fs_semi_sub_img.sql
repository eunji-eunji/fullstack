-- MySQL dump 10.13  Distrib 8.0.41, for Win64 (x86_64)
--
-- Host: localhost    Database: fs_semi
-- ------------------------------------------------------
-- Server version	8.0.41

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `sub_img`
--

DROP TABLE IF EXISTS `sub_img`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `sub_img` (
  `img_id` int NOT NULL AUTO_INCREMENT,
  `act_id` varchar(8) DEFAULT NULL,
  `filename` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`img_id`),
  KEY `act_id` (`act_id`),
  CONSTRAINT `sub_img_ibfk_1` FOREIGN KEY (`act_id`) REFERENCES `activity` (`ACT_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=35 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sub_img`
--

LOCK TABLES `sub_img` WRITE;
/*!40000 ALTER TABLE `sub_img` DISABLE KEYS */;
INSERT INTO `sub_img` VALUES (1,'9BC4D872','kimbob.jpg'),(2,'9BC4D872','kimbob1.jpg'),(3,'9BC4D872','kimbob2.jpg'),(4,'9BC4D872','kimbob3.jpg'),(5,'9BC4D872','kimbob4.jpg'),(6,'3D9A7E6F','Makgeolli1.jpg'),(7,'3D9A7E6F','Makgeolli2.jpg'),(8,'3D9A7E6F','Makgeolli3.jpg'),(9,'A7F3C1B2','kimchi1-1.jpg'),(10,'A7F3C1B2','kimchi1-2.jpg'),(11,'A7F3C1B2','kimchi1-3.jpg'),(12,'FE1085AC','kimchi2-1.jpg'),(13,'FE1085AC','kimchi2-2.jpg'),(14,'FE1085AC','kimchi2-3.jpg'),(15,'5F7BD0A6','kimbob2-1.jpg'),(16,'5F7BD0A6','kimbob2-2.jpg'),(17,'5F7BD0A6','kimbob2-3.jpg'),(18,'5F7BD0A6','kimbob2-4.jpg'),(19,'C81D3A7B','Makgeolli2-1.jpg'),(20,'C81D3A7B','Makgeolli2-2.jpg'),(21,'C81D3A7B','Makgeolli2-3.jpg'),(22,'C81D3A7B','Makgeolli2-4.jpg'),(23,'F0E1C5D8','hanbok1-1.jpg'),(24,'F0E1C5D8','hanbok1-2.jpg'),(25,'F0E1C5D8','hanbok1-3.jpg'),(26,'3AB4F7E0','hanbok2-1.jpg'),(27,'3AB4F7E0','hanbok2-2.jpg'),(28,'3AB4F7E0','hanbok2-3.jpg'),(29,'3AB4F7E0','hanbok2-4.jpg'),(30,'A7F3B2C9','Jongro1.jpg'),(31,'A7F3B2C9','Jongro2.jpg'),(32,'A7F3B2C9','Jongro3.jpg'),(33,'A7F3B2C9','Jongro4.jpg'),(34,'A7F3B2C9','Jongro5.jpg');
/*!40000 ALTER TABLE `sub_img` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2025-05-21 16:58:06
