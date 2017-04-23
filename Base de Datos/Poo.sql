-- phpMyAdmin SQL Dump
-- version 4.6.4
-- https://www.phpmyadmin.net/
--
-- Servidor: localhost
-- Tiempo de generación: 23-04-2017 a las 03:43:52
-- Versión del servidor: 5.7.15-log
-- Versión de PHP: 5.6.26

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `poo`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `areas`
--

CREATE TABLE `areas` (
  `id` int(2) NOT NULL,
  `area` varchar(30) COLLATE utf8mb4_spanish_ci DEFAULT NULL,
  `zona` varchar(30) COLLATE utf8mb4_spanish_ci DEFAULT NULL,
  `lugar` varchar(30) COLLATE utf8mb4_spanish_ci DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_spanish_ci;

--
-- Volcado de datos para la tabla `areas`
--

INSERT INTO `areas` (`id`, `area`, `zona`, `lugar`) VALUES
(1, 'Edificio A', 'Primer Nivel', 'Pasillo'),
(2, 'Talleres', 'Lab Ing.Civil', 'Baños Hombre'),
(3, 'Edificio B', 'Segundo Nivel', 'B2-05'),
(4, 'Edificio C', 'Talle Maquinas y Herramientas', 'Sala 2'),
(5, 'Edificio A', 'Terer Nivel', 'A3-04');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `asignar`
--

CREATE TABLE `asignar` (
  `asig` int(6) NOT NULL,
  `sol` int(3) DEFAULT NULL,
  `prd` int(1) DEFAULT NULL,
  `asignado` varchar(25) DEFAULT NULL,
  `fecha` date DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura Stand-in para la vista `consulta`
-- (Véase abajo para la vista actual)
--
CREATE TABLE `consulta` (
`codigo` int(3)
,`usuario` varchar(30)
,`tipo_tarea` varchar(30)
,`area` varchar(30)
,`zona` varchar(30)
,`lugar` varchar(30)
,`detalle` varchar(100)
,`fecha` varchar(10)
);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `estado`
--

CREATE TABLE `estado` (
  `est` int(1) NOT NULL,
  `nombre` varchar(30) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `estado`
--

INSERT INTO `estado` (`est`, `nombre`) VALUES
(1, 'Pendiente'),
(2, 'Asignado'),
(3, 'Trabajando'),
(4, 'Terminado');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `perfil`
--

CREATE TABLE `perfil` (
  `perfil` int(1) NOT NULL,
  `nombre` varchar(30) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `perfil`
--

INSERT INTO `perfil` (`perfil`, `nombre`) VALUES
(1, 'Usuario'),
(2, 'Tecnico'),
(3, 'Encargado'),
(4, 'Ejecutivo');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `prioridad`
--

CREATE TABLE `prioridad` (
  `prd` int(1) NOT NULL,
  `nombre` varchar(30) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `prioridad`
--

INSERT INTO `prioridad` (`prd`, `nombre`) VALUES
(1, 'Normal'),
(2, 'Importante'),
(3, 'Urgente');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `solicitudes`
--

CREATE TABLE `solicitudes` (
  `sol` int(3) NOT NULL,
  `user` int(2) DEFAULT NULL,
  `tipo_tarea` int(2) DEFAULT NULL,
  `area` int(2) DEFAULT NULL,
  `detalle` varchar(100) DEFAULT NULL,
  `fecha` varchar(10) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `solicitudes`
--

INSERT INTO `solicitudes` (`sol`, `user`, `tipo_tarea`, `area`, `detalle`, `fecha`) VALUES
(1, 1, 2, 1, 'Toma corriente averiado', '18/04/2017'),
(2, 1, 4, 2, 'Mangueras rotas', '04/04/2017'),
(3, 1, 6, 3, 'Las sillas estan rotas', '20/04/2017'),
(4, 1, 3, 4, 'El Compresor no esta funcionando', '30/03/2017'),
(5, 1, 5, 5, 'Que le falta gas', '04/04/2017');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipo_tarea`
--

CREATE TABLE `tipo_tarea` (
  `tipo` int(2) NOT NULL,
  `nombre` varchar(30) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `tipo_tarea`
--

INSERT INTO `tipo_tarea` (`tipo`, `nombre`) VALUES
(1, 'Limpieza'),
(2, 'Electrico'),
(3, 'Mecanico'),
(4, 'Plomeria'),
(5, 'Refrigeracion'),
(6, 'Carpinteria'),
(7, 'Area Verde'),
(8, 'Preventivo'),
(9, 'Pintura'),
(10, 'TI');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

CREATE TABLE `usuarios` (
  `user` int(2) NOT NULL,
  `nombre` varchar(30) DEFAULT NULL,
  `apellido` varchar(30) DEFAULT NULL,
  `cedula` varchar(14) DEFAULT NULL,
  `estado_civil` int(1) DEFAULT '0',
  `fecha_n` date DEFAULT NULL,
  `telefono` varchar(17) DEFAULT NULL,
  `direccion` varchar(200) DEFAULT NULL,
  `correo` varchar(50) DEFAULT NULL,
  `login` varchar(30) DEFAULT NULL,
  `clave` varchar(30) DEFAULT NULL,
  `perfil` int(1) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `usuarios`
--

INSERT INTO `usuarios` (`user`, `nombre`, `apellido`, `cedula`, `estado_civil`, `fecha_n`, `telefono`, `direccion`, `correo`, `login`, `clave`, `perfil`) VALUES
(1, 'Jose Miguel', 'Colon Muñoz', '213-3123322-2', 0, '1993-10-17', '829-355-4913', 'KNDlwnnqwldnlandlnslndalsndlnasldnalsnd', 'adsadklasjdljskdljklasdjlksajdklsajd', 'samy', '19931017', 4);

-- --------------------------------------------------------

--
-- Estructura para la vista `consulta`
--
DROP TABLE IF EXISTS `consulta`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `consulta`  AS  select `d`.`sol` AS `codigo`,`a`.`login` AS `usuario`,`b`.`nombre` AS `tipo_tarea`,`c`.`area` AS `area`,`c`.`zona` AS `zona`,`c`.`lugar` AS `lugar`,`d`.`detalle` AS `detalle`,`d`.`fecha` AS `fecha` from (((`usuarios` `a` join `tipo_tarea` `b`) join `areas` `c`) join `solicitudes` `d`) where ((`d`.`user` = `a`.`user`) and (`d`.`tipo_tarea` = `b`.`tipo`) and (`d`.`area` = `c`.`id`)) ;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `areas`
--
ALTER TABLE `areas`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `asignar`
--
ALTER TABLE `asignar`
  ADD PRIMARY KEY (`asig`);

--
-- Indices de la tabla `estado`
--
ALTER TABLE `estado`
  ADD PRIMARY KEY (`est`);

--
-- Indices de la tabla `perfil`
--
ALTER TABLE `perfil`
  ADD PRIMARY KEY (`perfil`);

--
-- Indices de la tabla `prioridad`
--
ALTER TABLE `prioridad`
  ADD PRIMARY KEY (`prd`);

--
-- Indices de la tabla `solicitudes`
--
ALTER TABLE `solicitudes`
  ADD PRIMARY KEY (`sol`);

--
-- Indices de la tabla `tipo_tarea`
--
ALTER TABLE `tipo_tarea`
  ADD PRIMARY KEY (`tipo`);

--
-- Indices de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  ADD PRIMARY KEY (`user`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `areas`
--
ALTER TABLE `areas`
  MODIFY `id` int(2) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
--
-- AUTO_INCREMENT de la tabla `asignar`
--
ALTER TABLE `asignar`
  MODIFY `asig` int(6) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `estado`
--
ALTER TABLE `estado`
  MODIFY `est` int(1) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
--
-- AUTO_INCREMENT de la tabla `perfil`
--
ALTER TABLE `perfil`
  MODIFY `perfil` int(1) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
--
-- AUTO_INCREMENT de la tabla `prioridad`
--
ALTER TABLE `prioridad`
  MODIFY `prd` int(1) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
--
-- AUTO_INCREMENT de la tabla `solicitudes`
--
ALTER TABLE `solicitudes`
  MODIFY `sol` int(3) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
--
-- AUTO_INCREMENT de la tabla `tipo_tarea`
--
ALTER TABLE `tipo_tarea`
  MODIFY `tipo` int(2) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;
--
-- AUTO_INCREMENT de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  MODIFY `user` int(2) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
