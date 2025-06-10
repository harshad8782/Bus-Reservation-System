-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Oct 10, 2023 at 02:25 AM
-- Server version: 10.4.22-MariaDB
-- PHP Version: 7.4.27

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `bus`
--

-- --------------------------------------------------------

--
-- Table structure for table `abcd`
--

CREATE TABLE `abcd` (
  `Sr_no` int(11) NOT NULL,
  `seat_no` int(11) NOT NULL,
  `source` varchar(40) NOT NULL,
  `Destination` varchar(40) NOT NULL,
  `amount` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `amount_bal`
--

CREATE TABLE `amount_bal` (
  `Sr_no` int(11) NOT NULL,
  `Name` varchar(40) NOT NULL,
  `bal` bigint(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `amount_bal`
--

INSERT INTO `amount_bal` (`Sr_no`, `Name`, `bal`) VALUES
(1, 'Priyanshu', 0),
(2, 'zxc', 2000),
(3, 'abcd', 500),
(5, 'pqr', 500),
(6, 'Vineet', 3750),
(7, 'Rahul', 750),
(8, 'zxcvb', 1000),
(9, 'raj', 1750);

-- --------------------------------------------------------

--
-- Table structure for table `kaushik`
--

CREATE TABLE `kaushik` (
  `Sr_no` int(11) NOT NULL,
  `seat_no` int(11) NOT NULL,
  `source` varchar(40) NOT NULL,
  `Destination` varchar(40) NOT NULL,
  `amount` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `kaushik`
--

INSERT INTO `kaushik` (`Sr_no`, `seat_no`, `source`, `Destination`, `amount`) VALUES
(12, 10, 'Mumbai', 'Pune', 250);

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

CREATE TABLE `login` (
  `ID` int(11) NOT NULL,
  `Name` varchar(30) NOT NULL,
  `Email_id` varchar(50) NOT NULL,
  `Age` int(11) NOT NULL,
  `Gender` varchar(10) NOT NULL,
  `Password` varchar(40) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `login`
--

INSERT INTO `login` (`ID`, `Name`, `Email_id`, `Age`, `Gender`, `Password`) VALUES
(1, 'Priyanshuu Worllikar', 'worlikarpriyanshu50@gmail.com', 19, 'Male', '12345'),
(2, 'Harshad', 'harshad50@gmail.com', 19, 'Male', '12345'),
(3, '123', '123', 12, 'Male', '123'),
(4, 'Kaushik', 'kaushik@gmail.com', 19, 'Male', '12345'),
(5, 'Shubham', 'shubham@gmail.com', 19, 'Male', '12345'),
(6, 'abcd', 'abcd@gmail.com', 19, 'Male', '12345'),
(7, 'zxc', 'zxc@gmail.com', 20, 'Male', '123'),
(8, 'pqr', 'pqr@gmail.com', 19, 'Female', '12345'),
(9, 'Vineet', 'vineet@gmail.com', 19, 'Male', '12345'),
(10, 'Rahul', 'rahul@gmail.com', 19, 'Male', '12345'),
(11, 'zxcvb', 'zxcvb@gmail.com', 19, 'Male', '123'),
(12, 'raj', 'raj@gmail.com', 19, 'Male', '123');

-- --------------------------------------------------------

--
-- Table structure for table `mum_goa`
--

CREATE TABLE `mum_goa` (
  `seat_no` int(11) NOT NULL,
  `status` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `mum_goa`
--

INSERT INTO `mum_goa` (`seat_no`, `status`) VALUES
(1, 'empty'),
(2, 'empty'),
(3, 'empty'),
(4, 'empty'),
(5, 'empty'),
(6, 'empty'),
(7, 'empty'),
(8, 'empty'),
(9, 'empty'),
(10, 'empty'),
(11, 'empty'),
(12, 'full'),
(13, 'empty'),
(14, 'empty'),
(15, 'empty'),
(16, 'empty'),
(17, 'empty'),
(18, 'empty'),
(19, 'empty'),
(20, 'empty'),
(21, 'empty'),
(22, 'full'),
(23, 'empty'),
(24, 'empty'),
(25, 'empty'),
(26, 'empty'),
(27, 'full'),
(28, 'empty'),
(29, 'full'),
(30, 'full');

-- --------------------------------------------------------

--
-- Table structure for table `mum_guj`
--

CREATE TABLE `mum_guj` (
  `seat_no` int(11) NOT NULL,
  `status` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `mum_guj`
--

INSERT INTO `mum_guj` (`seat_no`, `status`) VALUES
(1, 'empty'),
(2, 'empty'),
(3, 'empty'),
(4, 'empty'),
(5, 'empty'),
(6, 'full'),
(7, 'empty'),
(8, 'empty'),
(9, 'empty'),
(10, 'empty'),
(11, 'full'),
(12, 'empty'),
(13, 'empty'),
(14, 'empty'),
(15, 'empty'),
(16, 'empty'),
(17, 'empty'),
(18, 'empty'),
(19, 'empty'),
(20, 'empty'),
(21, 'empty'),
(22, 'empty'),
(23, 'empty'),
(24, 'empty'),
(25, 'full'),
(26, 'empty'),
(27, 'empty'),
(28, 'empty'),
(29, 'empty'),
(30, 'empty');

-- --------------------------------------------------------

--
-- Table structure for table `mum_kolh`
--

CREATE TABLE `mum_kolh` (
  `seat_no` int(11) NOT NULL,
  `status` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `mum_kolh`
--

INSERT INTO `mum_kolh` (`seat_no`, `status`) VALUES
(1, 'empty'),
(2, 'empty'),
(3, 'empty'),
(4, 'full'),
(5, 'empty'),
(6, 'empty'),
(7, 'empty'),
(8, 'empty'),
(9, 'empty'),
(10, 'empty'),
(11, 'empty'),
(12, 'empty'),
(13, 'empty'),
(14, 'empty'),
(15, 'empty'),
(16, 'empty'),
(17, 'empty'),
(18, 'empty'),
(19, 'empty'),
(20, 'empty'),
(21, 'full'),
(22, 'empty'),
(23, 'empty'),
(24, 'empty'),
(25, 'empty'),
(26, 'empty'),
(27, 'empty'),
(28, 'empty'),
(29, 'empty'),
(30, 'empty');

-- --------------------------------------------------------

--
-- Table structure for table `mum_pune`
--

CREATE TABLE `mum_pune` (
  `seat_no` int(11) NOT NULL,
  `status` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `mum_pune`
--

INSERT INTO `mum_pune` (`seat_no`, `status`) VALUES
(1, 'empty'),
(2, 'empty'),
(3, 'full'),
(4, 'empty'),
(5, 'empty'),
(6, 'empty'),
(7, 'empty'),
(8, 'full'),
(9, 'empty'),
(10, 'empty'),
(11, 'empty'),
(12, 'empty'),
(13, 'empty'),
(14, 'empty'),
(15, 'empty'),
(16, 'empty'),
(17, 'empty'),
(18, 'full'),
(19, 'empty'),
(20, 'empty'),
(21, 'empty'),
(22, 'empty'),
(23, 'empty'),
(24, 'full'),
(25, 'empty'),
(26, 'full'),
(27, 'empty'),
(28, 'full'),
(29, 'empty'),
(30, 'empty');

-- --------------------------------------------------------

--
-- Table structure for table `pqr`
--

CREATE TABLE `pqr` (
  `Sr_no` int(11) NOT NULL,
  `seat_no` int(11) NOT NULL,
  `source` varchar(40) NOT NULL,
  `Destination` varchar(40) NOT NULL,
  `amount` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `rahul`
--

CREATE TABLE `rahul` (
  `Sr_no` int(11) NOT NULL,
  `seat_no` int(11) NOT NULL,
  `source` varchar(40) NOT NULL,
  `Destination` varchar(40) NOT NULL,
  `amount` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `rahul`
--

INSERT INTO `rahul` (`Sr_no`, `seat_no`, `source`, `Destination`, `amount`) VALUES
(2, 3, 'Mumbai', 'Pune', 250);

-- --------------------------------------------------------

--
-- Table structure for table `raj`
--

CREATE TABLE `raj` (
  `Sr_no` int(11) NOT NULL,
  `seat_no` int(11) NOT NULL,
  `source` varchar(40) NOT NULL,
  `Destination` varchar(40) NOT NULL,
  `amount` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `raj`
--

INSERT INTO `raj` (`Sr_no`, `seat_no`, `source`, `Destination`, `amount`) VALUES
(1, 26, 'Mumbai', 'Pune', 250);

-- --------------------------------------------------------

--
-- Table structure for table `shubham`
--

CREATE TABLE `shubham` (
  `Sr_no` int(11) NOT NULL,
  `seat_no` int(11) NOT NULL,
  `source` varchar(40) NOT NULL,
  `Destination` varchar(40) NOT NULL,
  `amount` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `shubham`
--

INSERT INTO `shubham` (`Sr_no`, `seat_no`, `source`, `Destination`, `amount`) VALUES
(1, 20, 'Mumbai', 'Pune', 250);

-- --------------------------------------------------------

--
-- Table structure for table `vineet`
--

CREATE TABLE `vineet` (
  `Sr_no` int(11) NOT NULL,
  `seat_no` int(11) NOT NULL,
  `source` varchar(40) NOT NULL,
  `Destination` varchar(40) NOT NULL,
  `amount` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `vineet`
--

INSERT INTO `vineet` (`Sr_no`, `seat_no`, `source`, `Destination`, `amount`) VALUES
(3, 1, 'Mumbai', 'Goa', 250);

-- --------------------------------------------------------

--
-- Table structure for table `zxc`
--

CREATE TABLE `zxc` (
  `Sr_no` int(11) NOT NULL,
  `seat_no` int(11) NOT NULL,
  `source` varchar(40) NOT NULL,
  `Destination` varchar(40) NOT NULL,
  `amount` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `zxcvb`
--

CREATE TABLE `zxcvb` (
  `Sr_no` int(11) NOT NULL,
  `seat_no` int(11) NOT NULL,
  `source` varchar(40) NOT NULL,
  `Destination` varchar(40) NOT NULL,
  `amount` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `zxcvb`
--

INSERT INTO `zxcvb` (`Sr_no`, `seat_no`, `source`, `Destination`, `amount`) VALUES
(3, 18, 'Mumbai', 'Pune', 250),
(4, 8, 'Mumbai', 'Pune', 250),
(5, 28, 'Mumbai', 'Pune', 250),
(6, 6, 'Mumbai', 'Gujarat', 250),
(7, 11, 'Mumbai', 'Gujarat', 250),
(8, 25, 'Mumbai', 'Gujarat', 250),
(9, 27, 'Mumbai', 'Goa', 250),
(10, 12, 'Mumbai', 'Goa', 250),
(11, 22, 'Mumbai', 'Goa', 250),
(12, 21, 'Mumbai', 'Kolhapur', 250),
(13, 4, 'Mumbai', 'Kolhapur', 250);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `abcd`
--
ALTER TABLE `abcd`
  ADD PRIMARY KEY (`Sr_no`);

--
-- Indexes for table `amount_bal`
--
ALTER TABLE `amount_bal`
  ADD PRIMARY KEY (`Sr_no`);

--
-- Indexes for table `kaushik`
--
ALTER TABLE `kaushik`
  ADD PRIMARY KEY (`Sr_no`);

--
-- Indexes for table `login`
--
ALTER TABLE `login`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `pqr`
--
ALTER TABLE `pqr`
  ADD PRIMARY KEY (`Sr_no`);

--
-- Indexes for table `rahul`
--
ALTER TABLE `rahul`
  ADD PRIMARY KEY (`Sr_no`);

--
-- Indexes for table `raj`
--
ALTER TABLE `raj`
  ADD PRIMARY KEY (`Sr_no`);

--
-- Indexes for table `shubham`
--
ALTER TABLE `shubham`
  ADD PRIMARY KEY (`Sr_no`);

--
-- Indexes for table `vineet`
--
ALTER TABLE `vineet`
  ADD PRIMARY KEY (`Sr_no`);

--
-- Indexes for table `zxc`
--
ALTER TABLE `zxc`
  ADD PRIMARY KEY (`Sr_no`);

--
-- Indexes for table `zxcvb`
--
ALTER TABLE `zxcvb`
  ADD PRIMARY KEY (`Sr_no`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `abcd`
--
ALTER TABLE `abcd`
  MODIFY `Sr_no` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `amount_bal`
--
ALTER TABLE `amount_bal`
  MODIFY `Sr_no` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- AUTO_INCREMENT for table `kaushik`
--
ALTER TABLE `kaushik`
  MODIFY `Sr_no` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;

--
-- AUTO_INCREMENT for table `login`
--
ALTER TABLE `login`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;

--
-- AUTO_INCREMENT for table `pqr`
--
ALTER TABLE `pqr`
  MODIFY `Sr_no` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `rahul`
--
ALTER TABLE `rahul`
  MODIFY `Sr_no` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `raj`
--
ALTER TABLE `raj`
  MODIFY `Sr_no` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `shubham`
--
ALTER TABLE `shubham`
  MODIFY `Sr_no` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `vineet`
--
ALTER TABLE `vineet`
  MODIFY `Sr_no` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `zxc`
--
ALTER TABLE `zxc`
  MODIFY `Sr_no` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `zxcvb`
--
ALTER TABLE `zxcvb`
  MODIFY `Sr_no` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
