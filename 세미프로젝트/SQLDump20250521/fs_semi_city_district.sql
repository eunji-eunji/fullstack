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
-- Table structure for table `city_district`
--

DROP TABLE IF EXISTS `city_district`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `city_district` (
  `id` int NOT NULL AUTO_INCREMENT,
  `d_city_num` int DEFAULT NULL,
  `d_title` varchar(50) NOT NULL,
  `d_note` varchar(255) NOT NULL,
  `d_img` varchar(100) NOT NULL,
  `d_tag1` varchar(50) DEFAULT NULL,
  `d_tag1_img` varchar(255) DEFAULT NULL,
  `d_tag2` varchar(50) DEFAULT NULL,
  `d_tag2_img` varchar(255) DEFAULT NULL,
  `d_tag3` varchar(50) DEFAULT NULL,
  `d_tag3_img` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `d_city_num` (`d_city_num`),
  CONSTRAINT `city_district_ibfk_1` FOREIGN KEY (`d_city_num`) REFERENCES `city` (`city_num`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `city_district`
--

LOCK TABLES `city_district` WRITE;
/*!40000 ALTER TABLE `city_district` DISABLE KEYS */;
INSERT INTO `city_district` VALUES (1,1,'성수동','개성 넘치는 카페와 트렌디한 문화가 공존하는 지역','seongsu01.jpg','플랫폼엘','seongsu02.jpg','성수연방','seongsu03.jpg','수제화거리','seongsu04.jpg'),(2,1,'홍대','젊음과 예술이 넘치는 서울의 대표 거리','hongdae01.jpg','홍익대학교','hongdae02.jpg','걷고싶은거리','hongdae03.jpg','홍대 프리마켓','hongdae04.jpg'),(3,2,'해운대구','부산의 대표 해양 관광지','haeundae01.jpg','해운대 해수욕장','haeundae02.jpg','동백섬','haeundae03.jpg','더베이101','haeundae04.jpg'),(4,2,'남포동','역사와 쇼핑이 공존하는 번화가','nampo01.jpg','자갈치시장','nampo02.jpg','국제시장','nampo03.jpg','BIFF광장','nampo04.jpg'),(5,3,'서귀포시','제주의 자연이 살아 숨쉬는 남부 지역','seogwipo01.jpg','천지연폭포','seogwipo02.jpg','정방폭포','seogwipo03.jpg','외돌개','seogwipo04.jpg'),(6,3,'애월읍','바다와 감성카페가 어우러진 힐링 명소','aewol01.jpg','곽지해수욕장','aewol02.jpg','한담해안산책로','aewol03.jpg','봄날카페','aewol04.jpg'),(7,4,'황남동','천년 고도 경주의 전통을 간직한 마을','hwangnam01.jpg','첨성대','hwangnam02.jpg','대릉원','hwangnam03.jpg','황리단길','hwangnam04.jpg'),(8,4,'보문단지','경주의 휴양과 레저를 모두 갖춘 관광 단지','bomun01.jpg','보문호수','bomun02.jpg','경주월드','bomun03.jpg','캘리포니아비치','bomun04.jpg');
/*!40000 ALTER TABLE `city_district` ENABLE KEYS */;
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
