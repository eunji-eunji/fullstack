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
-- Table structure for table `boardf`
--

DROP TABLE IF EXISTS `boardf`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `boardf` (
  `num` int NOT NULL AUTO_INCREMENT,
  `id` varchar(10) NOT NULL,
  `subject` varchar(100) NOT NULL,
  `content` text NOT NULL,
  `regist_day` varchar(30) DEFAULT NULL,
  `hit` int NOT NULL DEFAULT '0',
  `ip` varchar(20) DEFAULT NULL,
  `liking` int NOT NULL DEFAULT '0',
  `file_name` varchar(255) DEFAULT NULL,
  `original_file_name` varchar(255) DEFAULT NULL,
  `file_size` bigint DEFAULT NULL,
  `category` varchar(20) NOT NULL,
  `comment_count` int DEFAULT '0',
  `status` varchar(10) DEFAULT 'active',
  PRIMARY KEY (`num`),
  KEY `idx_category` (`category`),
  KEY `idx_id` (`id`),
  KEY `idx_regist_day` (`regist_day`),
  CONSTRAINT `boardf_chk_1` CHECK ((`category` in (_utf8mb4'food',_utf8mb4'beauty',_utf8mb4'location')))
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `boardf`
--

LOCK TABLES `boardf` WRITE;
/*!40000 ALTER TABLE `boardf` DISABLE KEYS */;
INSERT INTO `boardf` VALUES (3,'user1','한국','좋은건가?','2025/05/21(13:03:31)',3,'0:0:0:0:0:0:0:1',0,NULL,NULL,0,'location',0,'active'),(4,'admin','관광게시판','관광 이야기만','2025/05/21(13:04:55)',0,'0:0:0:0:0:0:0:1',0,NULL,NULL,0,'location',0,'active'),(5,'kakao','내가 공지다','성공?','2025/05/21(13:06:43)',4,'0:0:0:0:0:0:0:1',0,NULL,NULL,0,'location',0,'active'),(6,'user1','제목','내용','2025/05/21(15:34:06)',1,'0:0:0:0:0:0:0:1',0,NULL,NULL,0,'food',0,'active');
/*!40000 ALTER TABLE `boardf` ENABLE KEYS */;
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
