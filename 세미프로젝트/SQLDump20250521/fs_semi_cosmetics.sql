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
-- Table structure for table `cosmetics`
--

DROP TABLE IF EXISTS `cosmetics`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cosmetics` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(30) NOT NULL,
  `brand` varchar(30) NOT NULL,
  `price` int NOT NULL,
  `main_ingredient` varchar(60) NOT NULL,
  `effect` varchar(60) NOT NULL,
  `category` varchar(30) NOT NULL,
  `image_file` varchar(60) NOT NULL,
  `likes` int DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=45 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cosmetics`
--

LOCK TABLES `cosmetics` WRITE;
/*!40000 ALTER TABLE `cosmetics` DISABLE KEYS */;
INSERT INTO `cosmetics` VALUES (1,'Matte Lipstick','Achic',12000,'Beeswax','Long-lasting','색조화장','makeup01.jpg',0),(2,'Glow Lipstick','Innisfree',15000,'Minerals','Glowing','색조화장','makeup02.jpg',0),(3,'Eye Shadow Palette','Etude',22000,'Talc','Colorful Eyes','색조화장','makeup03.jpg',0),(4,'Waterproof Mascara','Maybelline',18000,'Panthenol','Volume','색조화장','makeup04.jpg',0),(5,'Shimmer Highlighter','Aprilskin',17000,'Mica','Brightening','색조화장','makeup05.jpg',0),(6,'Cushion Foundation','Hera',30000,'Niacinamide','Brightening','색조화장','makeup06.jpg',0),(7,'Eyebrow Pencil','Clio',9000,'Wax','Natural Brows','색조화장','makeup07.jpg',0),(8,'Tint Lip Balm','Laneige',13000,'Shea Butter','Moisturizing','색조화장','makeup08.jpg',0),(9,'Body Lotion','Nivea',11000,'Aloe Vera','Hydrating','바디용품','body01.jpg',0),(10,'Shower Gel','The Body Shop',14000,'Tea Tree','Refreshing','바디용품','body02.jpg',1),(11,'Body Scrub','Skinfood',16000,'Sugar','Exfoliating','바디용품','body03.jpg',1),(12,'Foot Cream','Nature Republic',10000,'Shea Butter','Softening','바디용품','body04.jpg',0),(13,'Hand Cream','Innisfree',8000,'Green Tea','Moisturizing','바디용품','body05.jpg',0),(14,'Sunscreen Lotion','Dr.G',19000,'Zinc Oxide','UV Protection','바디용품','body06.jpg',0),(15,'Body Soap','Victoria’s Secret',17000,'Fragrance','Refreshing','바디용품','body07.jpg',0),(16,'Aroma Oil','Aromatica',15000,'Lavender','Relaxing','바디용품','body08.jpg',0),(17,'April Coushion','April skin',20000,'Hyaluronic Acid','Moisturizing','기초화장','basic01.jpg',0),(18,'Deep Cleanser','Immr',18000,'Salicylic Acid','Cleansing','기초화장','basic02.jpg',0),(19,'Moisture Cream','Vidivici',25000,'Ceramide','Hydrating','기초화장','basic03.jpg',0),(20,'Silky oil Serum','Vegan',30000,'Retinol','Firming','기초화장','basic04.jpg',0),(21,'Stem Ampoule Essence','Iope',27000,'Vitamin C','Brightening','기초화장','basic05.jpg',0),(22,'Balancing Coushion','Mool',16000,'Centella','Calming','기초화장','basic06.jpg',0),(23,'Soft-natuer Toner','Mool',19000,'Green Tea','Balancing','기초화장','basic07.jpg',0),(24,'Zero Pore One Day Cream','Medicube',32000,'Peptides','Repairing','기초화장','basic08.jpg',0),(25,'Pore Tightening Serum','Vidivici',28000,'Witch Hazel','Pore Care','기초화장','basic09.jpg',0),(26,'Facial Oil','Nuxe',35000,'Jojoba Oil','Nourishing','기초화장','basic10.jpg',0),(27,'Hydro Onion Clean Foam','Innisfree',22000,'Collagen','Plumping','기초화장','basic11.jpg',0),(28,'Cream Cleanser','Ofbase',20000,'Amino Acid','Mild Wash','기초화장','basic12.jpg',0),(29,'Spot Corrector','Vidivici',21000,'Niacinamide','Whitening','기초화장','basic13.jpg',0),(30,'AtobBarrier 365 Toner','Aestura',17000,'Panthenol','Soothing','기초화장','basic14.jpg',0),(31,'Cica Cream Mist','Panthecell',13000,'Rose Water','Refreshing','기초화장','basic15.jpg',0),(32,'Fixx','So.Natueral',33000,'Caffeine','De-puffing','기초화장','basic16.jpg',0),(33,'Jyun Lotion','Goku',12000,'Chamomile','Calming','기초화장','basic17.jpg',0),(34,'Whitening Coushion','Innisfree',26000,'Arbutin','Brightening','기초화장','basic18.jpg',0),(35,'Pore-remedy Gel','Dr.Jart+',31000,'Adenosine','Firming','기초화장','basic19.jpg',0),(36,'Mild Balm','Tonymoly',29000,'Squalane','Protecting','기초화장','basic20.jpg',0),(37,'Silky Shampoo','Tsubaki',17000,'Keratin','Smooth Hair','헤어용품','hair01.jpg',0),(38,'Hair Treatment','Tsubaki',23000,'Argan Oil','Repairing','헤어용품','hair02.jpg',0),(39,'Scalp Tonic','Ryo',25000,'Ginseng','Scalp Care','헤어용품','hair03.jpg',0),(40,'Hair Essence','Mise en Scene',21000,'Camellia Oil','Glossy Hair','헤어용품','hair04.jpg',0),(41,'Hair Pack','Nature Republic',19000,'Shea Butter','Nourishing','헤어용품','hair05.jpg',0),(42,'Styling Wax','Gatsby',13000,'Beeswax','Hold Style','헤어용품','hair06.jpg',0),(43,'Volume Spray','TRESemmé',16000,'Polymer','Volumizing','헤어용품','hair07.jpg',0),(44,'Leave-In Conditioner','Pantene',18000,'Vitamin B5','Moisturizing','헤어용품','hair08.jpg',0);
/*!40000 ALTER TABLE `cosmetics` ENABLE KEYS */;
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
