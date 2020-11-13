-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 05-08-2020 a las 02:49:55
-- Versión del servidor: 10.4.13-MariaDB
-- Versión de PHP: 7.4.8

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `db_sku_inventory`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tb_aprendiz`
--

CREATE TABLE `tb_aprendiz` (
  `apr_di` int(11) NOT NULL,
  `apr_nombre` varchar(50) DEFAULT NULL,
  `apr_apellido` varchar(45) DEFAULT NULL,
  `apr_telefono` varchar(45) DEFAULT NULL,
  `apr_email` varchar(45) DEFAULT NULL,
  `apr_ficha` int(11) DEFAULT NULL,
  `apr_usuario` varchar(45) DEFAULT NULL,
  `apr_password` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `tb_aprendiz`
--

INSERT INTO `tb_aprendiz` (`apr_di`, `apr_nombre`, `apr_apellido`, `apr_telefono`, `apr_email`, `apr_ficha`, `apr_usuario`, `apr_password`) VALUES
(1, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(123, 'aaa', 'aaa', 'aaa', 'aaa', 1907163, 'alex', '12345'),
(1010, 'wilmar', 'paez', 'srpaez@gmail.com', '300985332', 1907163, 'wilpaez', '111111'),
(11111, 'pepito', 'perez', '3109876543', 'alextamer@gmail.com', 1907163, NULL, NULL),
(12345, 'aaa', 'aaa', 'andresito@gmail.com', '123456789', 1907163, 'andresito', '123456'),
(1073170513, 'alexander', 'penagos', '3202150790', 'alextamer@gmail.com', 1907163, 'alext', '123456');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tb_aprendizsofia`
--

CREATE TABLE `tb_aprendizsofia` (
  `aps_di` int(12) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `tb_aprendizsofia`
--

INSERT INTO `tb_aprendizsofia` (`aps_di`) VALUES
(1010),
(2020);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tb_ficha`
--

CREATE TABLE `tb_ficha` (
  `fic_codigo` int(11) NOT NULL,
  `fic_programa` varchar(45) DEFAULT NULL,
  `fic_nivelformacion` varchar(45) DEFAULT NULL,
  `fic_fechainicio` date DEFAULT NULL,
  `fic_fechafin` date DEFAULT NULL,
  `fic_in_di` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `tb_ficha`
--

INSERT INTO `tb_ficha` (`fic_codigo`, `fic_programa`, `fic_nivelformacion`, `fic_fechainicio`, `fic_fechafin`, `fic_in_di`) VALUES
(1907163, 'adsi', 'tecnologo', '2019-07-22', '2021-02-21', 1073150791);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tb_instructor`
--

CREATE TABLE `tb_instructor` (
  `in_di` int(11) NOT NULL,
  `in_nombre` varchar(45) NOT NULL,
  `in_apellido` varchar(50) NOT NULL,
  `in_email` varchar(45) NOT NULL,
  `in_telefono` varchar(45) NOT NULL,
  `in_usuario` varchar(45) NOT NULL,
  `in_password` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `tb_instructor`
--

INSERT INTO `tb_instructor` (`in_di`, `in_nombre`, `in_apellido`, `in_email`, `in_telefono`, `in_usuario`, `in_password`) VALUES
(3030, 'pepito', 'sanchez', 'pepito@hotmail.com', '3209874653', 'pepito', '654321'),
(1073150791, 'esperanza', 'penagos', 'waltermarley@live.com.ar', '3132749017', 'esperanzita', '123456');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tb_instructorsofia`
--

CREATE TABLE `tb_instructorsofia` (
  `ins_di` int(12) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `tb_instructorsofia`
--

INSERT INTO `tb_instructorsofia` (`ins_di`) VALUES
(3030),
(4040);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `tb_aprendiz`
--
ALTER TABLE `tb_aprendiz`
  ADD PRIMARY KEY (`apr_di`),
  ADD KEY `apr_ficha` (`apr_ficha`),
  ADD KEY `apr_di` (`apr_di`) USING BTREE;

--
-- Indices de la tabla `tb_ficha`
--
ALTER TABLE `tb_ficha`
  ADD PRIMARY KEY (`fic_codigo`),
  ADD KEY `tb_in_di` (`fic_in_di`);

--
-- Indices de la tabla `tb_instructor`
--
ALTER TABLE `tb_instructor`
  ADD PRIMARY KEY (`in_di`);

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `tb_aprendiz`
--
ALTER TABLE `tb_aprendiz`
  ADD CONSTRAINT `apr_ficha` FOREIGN KEY (`apr_ficha`) REFERENCES `tb_ficha` (`fic_codigo`);

--
-- Filtros para la tabla `tb_ficha`
--
ALTER TABLE `tb_ficha`
  ADD CONSTRAINT `fic_in_di` FOREIGN KEY (`fic_in_di`) REFERENCES `tb_instructor` (`in_di`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
