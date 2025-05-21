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
-- Table structure for table `main`
--

DROP TABLE IF EXISTS `main`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `main` (
  `FILENAME` varchar(50) NOT NULL,
  `TITLE` varchar(50) NOT NULL,
  `NOTE` varchar(200) NOT NULL,
  `TAG1` varchar(30) DEFAULT NULL,
  `TAG2` varchar(30) DEFAULT NULL,
  `TAG3` varchar(30) DEFAULT NULL,
  `TAG4` varchar(30) DEFAULT NULL,
  `TAG5` varchar(30) DEFAULT NULL,
  `URL` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `main`
--

LOCK TABLES `main` WRITE;
/*!40000 ALTER TABLE `main` DISABLE KEYS */;
INSERT INTO `main` VALUES ('slideimg01.jpg','K-FOOD','K-FOOD 한식 | 김치, 불고기, 비빔밥, 조미김, 불닭볶음면, 떡볶이',NULL,NULL,NULL,NULL,NULL,'index.jsp'),('slideimg02.jpg','K-BEAUTY 한국의 뷰티 상품','Explore the rich and vibrant world of Korean culture!',NULL,NULL,NULL,NULL,NULL,'index.jsp'),('slideimg04.jpg','LOCATION','한국의 전통 관광지와 내 스타가 다녀간 장소들',NULL,NULL,NULL,NULL,NULL,'index.jsp'),('category_f.jpg','K-FOOD','한국 음식(한식)에 대한 정보 나눔','한식 레시피 나눔','맛집 공유','원데이 클래스 예약',NULL,NULL,'index.jsp'),('category_b.jpg','K-BEAUTY','한국의 화장품에 대한 정보 나눔','화장품 정보 공유',NULL,NULL,NULL,NULL,'index.jsp'),('category_l.jpg','LOCATION','한국 관광지에 대한 정보 나눔','내 스타가 다녀간 곳','전통 관광지',NULL,NULL,NULL,'index.jsp');
/*!40000 ALTER TABLE `main` ENABLE KEYS */;
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
