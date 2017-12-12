-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: 12-Dez-2017 às 12:27
-- Versão do servidor: 10.1.28-MariaDB
-- PHP Version: 7.1.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `natixishr`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `funcionarios`
--

CREATE TABLE `funcionarios` (
  `BI` int(11) NOT NULL,
  `nome` varchar(50) NOT NULL,
  `dataNascimento` date NOT NULL,
  `morada` varchar(100) NOT NULL,
  `categoria` varchar(20) NOT NULL,
  `funcao` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `funcionarios`
--

INSERT INTO `funcionarios` (`BI`, `nome`, `dataNascimento`, `morada`, `categoria`, `funcao`) VALUES
(12123467, 'Pedro Correia', '1981-12-31', 'Avenida da Boavista, 1234', 'full stack developer', 'developer'),
(12345678, 'Joaquim Nunes', '1980-11-22', 'Rua das Oliveiras, 25', 'web developer', 'developer'),
(12589631, 'Filipe Coutinho', '1988-04-08', 'Rua do Cais de Gaia, 13', 'tecnico de hardware', 'chefe de equipa'),
(23456789, 'Manuel Silva', '1977-11-03', 'Rua dos Columbofilos, 13', 'data base Admin', 'developer'),
(98765001, 'Tomas Filipe Nogueira', '1973-02-12', 'Rua do Jardim, 13 2DT', 'Java Developer', 'Scrum Master');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `funcionarios`
--
ALTER TABLE `funcionarios`
  ADD PRIMARY KEY (`BI`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
