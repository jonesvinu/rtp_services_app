CREATE TABLE `family` (
  `id` int(11) NOT NULL,
  `name` varchar(45) DEFAULT NULL,
  `contact_person` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_UNIQUE` (`id`),
  KEY `contact_person_fk_idx` (`contact_person`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci