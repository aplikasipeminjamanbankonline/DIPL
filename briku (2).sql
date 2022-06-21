-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 21 Jun 2022 pada 05.07
-- Versi server: 10.4.22-MariaDB
-- Versi PHP: 8.1.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `briku`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `admin`
--

CREATE TABLE `admin` (
  `idadmin` int(20) NOT NULL,
  `idnasabah` int(20) NOT NULL,
  `namanasabah` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Struktur dari tabel `kepalacabang`
--

CREATE TABLE `kepalacabang` (
  `idkepalacabang` int(20) NOT NULL,
  `idnasabah` int(20) NOT NULL,
  `namakepalacabang` varchar(30) NOT NULL,
  `statuspencairan` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Struktur dari tabel `komplain`
--

CREATE TABLE `komplain` (
  `nama` varchar(100) NOT NULL,
  `komplain` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `komplain`
--

INSERT INTO `komplain` (`nama`, `komplain`) VALUES
('cc', 'tesssttttt'),
('cc', 'test 123'),
('aliza', 'komplain aplikasi');

-- --------------------------------------------------------

--
-- Struktur dari tabel `nasabah`
--

CREATE TABLE `nasabah` (
  `idnasabah` int(50) NOT NULL,
  `namanasabah` varchar(50) NOT NULL,
  `tanggallahir` date NOT NULL,
  `norekening` int(50) NOT NULL,
  `status` varchar(20) NOT NULL,
  `jumlahdipinjam` int(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Struktur dari tabel `peminjaman`
--

CREATE TABLE `peminjaman` (
  `nominalpinjam` int(100) NOT NULL,
  `waktutenggat` varchar(20) NOT NULL,
  `angsuran` int(3) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `peminjaman`
--

INSERT INTO `peminjaman` (`nominalpinjam`, `waktutenggat`, `angsuran`) VALUES
(200000, '6 Bulan', 7),
(3000000, '6 Bulan', 3),
(1500000, '3 Bulan', 10),
(5000000, '6 Bulan', 7),
(7000000, '3 Bulan', 3);

-- --------------------------------------------------------

--
-- Struktur dari tabel `pengembalian`
--

CREATE TABLE `pengembalian` (
  `nominalpeminjaman` varchar(100) NOT NULL,
  `nominalkembali` varchar(100) NOT NULL,
  `waktukembali` varchar(100) NOT NULL,
  `angsuran` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `pengembalian`
--

INSERT INTO `pengembalian` (`nominalpeminjaman`, `nominalkembali`, `waktukembali`, `angsuran`) VALUES
('3000000', '1000000', '14 juni 2022', '1'),
('1500000', '300000', '14 juni 2022', '1'),
('5000000', '1000000', '14 juni 2022', '1');

-- --------------------------------------------------------

--
-- Struktur dari tabel `registrasi`
--

CREATE TABLE `registrasi` (
  `username` varchar(20) NOT NULL,
  `email` varchar(100) NOT NULL,
  `password` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `registrasi`
--

INSERT INTO `registrasi` (`username`, `email`, `password`) VALUES
('aliza', 'aliza@gmail.com', '1234'),
('aliza', '', '123'),
('aliza', '', '1234'),
('aliza', '', '1234'),
('alizarizka', '', '123456'),
('alizaa', 'lizaa@gmail.com', '12345'),
('alizaaa', 'zaa@gmail.com', '12345'),
('zaaa', 'zaaa@gmail.com', '12345'),
('lizaaaa', 'lizaaaa@gmail', '123'),
('rizka', 'rizka@gmail.com', '12345'),
('riz', 'riz@gmail.com', '123'),
('zz', 'zz@gmail.com', '123'),
('firda', 'firda@gmail.com', '12345'),
('firda1', 'firda1@gmail', '123'),
('nn', 'nn@gmail', '123'),
('cc', 'cc@gmail.com', '123'),
('hh', 'hh@gmail.com', '123'),
('ss', 'ss@gmail.com', '12345'),
('gg', 'gg@gmail.com', '12345'),
('dd', 'dd@gmail.com', '12345'),
('aliza rizka firdanii', 'alizarizka@gmail.com', '12345');

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`idadmin`);

--
-- Indeks untuk tabel `kepalacabang`
--
ALTER TABLE `kepalacabang`
  ADD PRIMARY KEY (`idkepalacabang`);

--
-- Indeks untuk tabel `nasabah`
--
ALTER TABLE `nasabah`
  ADD PRIMARY KEY (`idnasabah`);

--
-- AUTO_INCREMENT untuk tabel yang dibuang
--

--
-- AUTO_INCREMENT untuk tabel `admin`
--
ALTER TABLE `admin`
  MODIFY `idadmin` int(20) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT untuk tabel `kepalacabang`
--
ALTER TABLE `kepalacabang`
  MODIFY `idkepalacabang` int(20) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT untuk tabel `nasabah`
--
ALTER TABLE `nasabah`
  MODIFY `idnasabah` int(50) NOT NULL AUTO_INCREMENT;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
