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
-- Table structure for table `activity`
--

DROP TABLE IF EXISTS `activity`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `activity` (
  `ACT_ID` varchar(8) NOT NULL,
  `TITLE` varchar(100) NOT NULL,
  `IMG` varchar(100) DEFAULT NULL,
  `MAX_COUNT` int NOT NULL,
  `ACT_DATE` varchar(50) NOT NULL,
  `ADDRESS` varchar(200) NOT NULL,
  `NOTE` varchar(800) DEFAULT NULL,
  PRIMARY KEY (`ACT_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `activity`
--

LOCK TABLES `activity` WRITE;
/*!40000 ALTER TABLE `activity` DISABLE KEYS */;
INSERT INTO `activity` VALUES ('3AB4F7E0','한복체험-Ⅱ','hanbok2-1.jpg',20,'2025/7/11 17:00','서울특별시 종로구 사직로 133-5, 한복남 경복궁점','전통 한복을 입고 한국의 멋을 체험해보세요. 한복을 입고 특별한 사진을 남길 수 있습니다. 한국 문화를 몸소 느낄 수 있는 기회입니다!'),('3D9A7E6F','막걸리 빚기','mak-1 copy.jpg',12,'2025/5/23 18:30','서울특별시 종로구 북촌로 18, the sool gallery','한국 전통주 막걸리를 직접 만들어보는 체험입니다. 쌀과 누룩으로 전통 막걸리를 빚는 특별한 문화 체험입니다. 전통 재료로 막걸리를 만들며 한국 문화를 배워보세요.'),('5F7BD0A6','김밥만들기-Ⅱ','kimbob2-1.jpg',20,'2025/5/25 13:00','서울시 종로구 사직로 101 필운빌딩 신관 3층, 푸드앤컬쳐코리아','한국의 대표 음식인 김밥을 만들어 보세요. 신선한 재료로 직접 손수 만든 김밥을 즐겨보세요. 한국의 맛과 문화를 체험할 수 있는 특별한 기회입니다!'),('9BC4D872','김밥 만들기','kimbab-2 copy.jpg',10,'2025/5/22 11:00','서울시 종로구 사직로 101 필운빌딩 신관 3층, 푸드앤컬쳐코리아','이 예약 프로그램은 한국의 대중 음식 중 하나인 김밥을 만드는 프로그램입니다. 직접 재료를 손질하여 김밥을 만들고 맛보는 체험을 경험하실 수 있습니다.'),('A7F3B2C9','종로관광','Jongro1.jpg',20,'2025/8/5 13:00','서울시 마포구','종로의 전통과 현대를 모두 느낄 수 있는 여행! 역사적인 명소와 현대적인 매력을 동시에 체험하세요. 한국의 고유한 문화를 경험할 수 있는 특별한 기회입니다!'),('A7F3C1B2','김장 담그기','kimchi-1 copy.jpg',20,'25/5/21 13:00','서울시 중구 퇴계로 34길 28 남산골 한옥마을','한국의 겨울 준비, 김치를 직접 담가보는 전통 체험입니다. 손으로 김치를 담그며 한국의 김장 문화를 배워보세요.'),('C81D3A7B','막걸리 빚기-Ⅱ','Makgeolli2-1.jpg',10,'2025/6/10 11:00','서울특별시 종로구 북촌로 18, the sool gallery','전통 방식으로 막걸리를 빚어보세요. 한국의 고유한 술 문화를 직접 체험할 수 있습니다. 친구와 함께 즐기는 특별한 시간이 될 거예요!'),('F0E1C5D8','한복체험','hanbok1-1.jpg',20,'2025/6/12 13:00','서울특별시 종로구 사직로 133-5, 한복남 경복궁점','전통 한복을 입고 한국의 멋을 체험해보세요. 한복을 입고 특별한 사진을 남길 수 있습니다. 한국 문화를 몸소 느낄 수 있는 기회입니다!'),('FE1085AC','김장 담그기-Ⅱ','kimchi-2 copy.jpg',20,'2025/5/20 13:00','서울시 중구 퇴계로 34길 28 남산골 한옥마을','신선한 재료로 김치를 직접 만드는 특별한 김장 체험! 김장을 함께하며 한국의 따뜻한 식문화를 느껴보세요.');
/*!40000 ALTER TABLE `activity` ENABLE KEYS */;
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
