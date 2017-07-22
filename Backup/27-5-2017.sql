-- MySQL dump 10.16  Distrib 10.1.13-MariaDB, for Win32 (AMD64)
--
-- Host: localhost    Database: labsys
-- ------------------------------------------------------
-- Server version	10.1.13-MariaDB

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Current Database: `labsys`
--

CREATE DATABASE /*!32312 IF NOT EXISTS*/ `labsys` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `labsys`;

--
-- Table structure for table `cad_backup`
--

DROP TABLE IF EXISTS `cad_backup`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `cad_backup` (
  `cod_backup` int(11) NOT NULL AUTO_INCREMENT,
  `nome_backup` varchar(150) DEFAULT NULL,
  PRIMARY KEY (`cod_backup`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8 COMMENT='nessa tabela será armazenado os parametros de configuracao do sistema';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cad_backup`
--

LOCK TABLES `cad_backup` WRITE;
/*!40000 ALTER TABLE `cad_backup` DISABLE KEYS */;
INSERT INTO `cad_backup` VALUES (1,'22-5-2017.sql'),(2,'25-5-2017.sql'),(3,'26-5-2017.sql'),(4,'26-5-2017.sql'),(5,'26-5-2017.sql'),(6,'26-5-2017.sql'),(7,'26-5-2017.sql'),(8,'26-5-2017.sql'),(9,'26-5-2017.sql'),(10,'26-5-2017.sql'),(11,'26-5-2017.sql'),(12,'27-5-2017.sql'),(13,'27-5-2017.sql'),(14,'27-5-2017.sql');
/*!40000 ALTER TABLE `cad_backup` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cad_horario`
--

DROP TABLE IF EXISTS `cad_horario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `cad_horario` (
  `cod_horario` int(11) NOT NULL AUTO_INCREMENT,
  `hora_inicio` varchar(10) DEFAULT NULL,
  `hora_fim` varchar(10) DEFAULT NULL,
  `n_seg` varchar(80) DEFAULT NULL,
  `n_ter` varchar(80) DEFAULT NULL,
  `n_qua` varchar(80) DEFAULT NULL,
  `n_qui` varchar(80) DEFAULT NULL,
  `n_sex` varchar(80) DEFAULT NULL,
  `n_sab` varchar(80) DEFAULT NULL,
  PRIMARY KEY (`cod_horario`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='nessa tabela será armazenado os horários de cada monitor';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cad_horario`
--

LOCK TABLES `cad_horario` WRITE;
/*!40000 ALTER TABLE `cad_horario` DISABLE KEYS */;
/*!40000 ALTER TABLE `cad_horario` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cad_lista_equipamentos`
--

DROP TABLE IF EXISTS `cad_lista_equipamentos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `cad_lista_equipamentos` (
  `cod_lista_equipamentos` int(11) NOT NULL AUTO_INCREMENT,
  `data` varchar(10) DEFAULT NULL,
  `monitores` int(11) DEFAULT NULL,
  `gabinetes` int(11) DEFAULT NULL,
  `mouses` int(11) DEFAULT NULL,
  `teclados` int(11) DEFAULT NULL,
  `nobreaks` int(11) DEFAULT NULL,
  `carteiras` int(11) DEFAULT NULL,
  `adaptadores` int(11) DEFAULT NULL,
  `cabos_rede` int(11) DEFAULT NULL,
  `cabos_vga` int(11) DEFAULT NULL,
  `estabilizadores` int(11) DEFAULT NULL,
  PRIMARY KEY (`cod_lista_equipamentos`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cad_lista_equipamentos`
--

LOCK TABLES `cad_lista_equipamentos` WRITE;
/*!40000 ALTER TABLE `cad_lista_equipamentos` DISABLE KEYS */;
/*!40000 ALTER TABLE `cad_lista_equipamentos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cad_maquina`
--

DROP TABLE IF EXISTS `cad_maquina`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `cad_maquina` (
  `COD_MAQUINA` varchar(5) NOT NULL,
  `MARCA_MAQUINA` varchar(20) DEFAULT NULL,
  `MODELO_MAQUINA` varchar(20) DEFAULT NULL,
  `NUM_IDENT_MAQUINA` int(11) DEFAULT NULL,
  `SO_MAQUINA` varchar(50) DEFAULT NULL,
  `PROCESSADOR_MAQUINA` varchar(30) DEFAULT NULL,
  `HD_MAQUINA` varchar(30) DEFAULT NULL,
  `MEMORIA_RAM_MAQUINA` varchar(30) DEFAULT NULL,
  `MEOMORIA_DEDICADA` varchar(30) DEFAULT NULL,
  `MONITOR_MAQUINA` varchar(30) DEFAULT NULL,
  `STATUS_FUNCIONAMENTO` varchar(30) DEFAULT NULL,
  `STATUS_USO` varchar(20) DEFAULT NULL,
  `obs` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`COD_MAQUINA`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cad_maquina`
--

LOCK TABLES `cad_maquina` WRITE;
/*!40000 ALTER TABLE `cad_maquina` DISABLE KEYS */;
INSERT INTO `cad_maquina` VALUES ('0001','HP','MINI TORRE',363523,'WINDOWS 8 / LINUX','INTEL I5','500GB','4GB','1GB','19\"','Funcionado','L',''),('0002','HP','MINI TORRE',162092,'WINDOWS 8 / LINUX','AMD CORE 2 DUO','500GB','4GB','500MB','17\"','Funcionado','L',''),('0003','HP','MINI TORRE',168273,'WINDOWS 8 / LINUX','INTEL I5','500GB','4GB','1GB','19\'','Funcionado','L',''),('0004','HP','MINI TORRE',905863,'WINDOWS 8 / LINUX','INTEL I5','500GB','4GB','1GB','19\"','Funcionado','L',''),('0005','HP','MINI TORRE',387463,'WINDOWS 8 / LINUX','INTEL I5','500GB','4GB','1GB','19\"','Funcionado','L',''),('0006','HP','MINI TORRE',938474,'WINDOWS 8 / LINUX','INTEL I5','500GB','4GB','1GB','19\"','Funcionado','L',''),('0007','HP','MINI TORRE',484746,'WINDOWS 8 / LINUX','AMD VISION PRO','500GB','4GB','1GB','19\"','Funcionado','L',''),('0008','HP ','MINI TORRE',864723,'WINDOWS 8 / LINUX','AMD VISION PRO','500GB','4GB','1GB','19\"','Funcionado','L',''),('0009','HP ','MINI TORRE',384732,'WINDOWS 8 / LINUX','AMD VISION PRO','500GB','4GB','1GB','19\"','Com Defeito','L',''),('0010','HP','MINI TORRE',583832,'WINDOWS 8 / LINUX','AMD VISION PRO','500GB','4GB','1GB','19\"','Manutenção','L',''),('12','EQWE','J',7,'W','J','S','M','M','M','Manutenção','L','D'),('QWE','QWEWQE','QWEWQ',123,'QWE','QWE','QWE','QWE','QWE','QWE','Com Defeito','L','QWE');
/*!40000 ALTER TABLE `cad_maquina` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cad_usuario`
--

DROP TABLE IF EXISTS `cad_usuario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `cad_usuario` (
  `COD_USUARIO` varchar(15) NOT NULL,
  `NOME_USUARIO` varchar(100) DEFAULT NULL,
  `DATA_NASC_USUARIO` varchar(10) DEFAULT NULL,
  `PERMISSAO_USUARIO` varchar(20) DEFAULT NULL,
  `SENHA_USUARIO` varchar(256) DEFAULT NULL,
  `TAG` varchar(256) DEFAULT NULL,
  `CURSO_USUARIO` varchar(30) DEFAULT NULL,
  `FOTO_USUARIO` longblob,
  `LOGIN_USUARIO` varchar(30) DEFAULT NULL,
  `PERIODO_INGRESSO` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`COD_USUARIO`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cad_usuario`
--

LOCK TABLES `cad_usuario` WRITE;
/*!40000 ALTER TABLE `cad_usuario` DISABLE KEYS */;
INSERT INTO `cad_usuario` VALUES ('1212','1212','11/11/1992','Usuário Comum','MTIzNA==','1212','1212','����\0JFIF\0\0\0\0\0\0��\0C\0		\n\r\Z\Z $.\' \",#(7),01444\'9=82<.342��\0C			\r\r2!!22222222222222222222222222222222222222222222222222��\0\0i\0m\"\0��\0\0\0\0\0\0\0\0\0\0\0	\n��\0�\0\0\0}\0!1AQa\"q2���#B��R��$3br�	\n\Z%&\'()*456789:CDEFGHIJSTUVWXYZcdefghijstuvwxyz���������������������������������������������������������������������������\0\0\0\0\0\0\0\0	\n��\0�\0\0w\0!1AQaq\"2�B����	#3R�br�\n$4�%�\Z&\'()*56789:CDEFGHIJSTUVWXYZcdefghijstuvwxyz��������������������������������������������������������������������������\0\0\0?\0�mf�	��V�Ӯx#����:֍�����o:HGU=py�p�N�ȉDm6䁸�ێ}1׽+i�1:x�n�f\0q����������S����[�O�;����\'�N8��8�W����ҼP��xܬ@O��~Y�;]c_��v�A�\\��r:��#�9��qje:t��͏N�An��+����޵[����5��7$Q	Y��N�YW���\"�oRnvnr��зs�c�������#��-�N��yܫ6�����\0���v�l�J<��=�0�Ʋ#G����s�+����`��q����v����V��o4�ౖ�n�\"��X�<����5�E�j�w�#X�`v�&�3���w���\Zz��$�=\"����+���2.훷`v���jV�wC2�����1�n9�q��r����i�{b�;A,�0��A�=_ʹy5�ۡw,������쀫q��Ozj��ԕM7��I��K��eaс�i�\\W-u���^�L��y0�w�9Q���=~�ܶ�W���~\\`���c���0O\'����tѼG�d�K�9���Gɚ9v2#�pv�ݐq�׍x�]�Z����H�di\Z	r0�O8�~��>�1���*�C4.�,���V���jqh��\0{*�PpA�8�rj�����8����Q�!e�H1�����.b��_��9�Զ��ۙr_QY�K?=�\"�h&�\n0��d�U��.H����<՘m�r\"\'���T!�:ȣ88^~�v�.��)��l�%r(�M1H+��r P�i�s&\r�\08>\\����u|`\0��2=8С���$�r?�)�Nc�7��b�̃i\\H��ŏ|~�Jh�ab�;�c�����ϭt��\r����T����ʿ>�6|�w�s��2��p2x#Ly��H`@P꣓��T\Z��Va)mwy,$\0gv9���]l��ɀ��;��\r5�����uE�=;��cU\'���-ü����s:����צ|!�Ή��V���y9��y��Z������m���2p}8WS��Qn/�p�n1�\Z��n�OZ%$Ս!RMٳ�����p8�q�f<��G���UN2&\0��\\Ye+��vR0rMt6�)2���D��8����D\\�b����\0��d��`�q�m�Y[�0�Fc�\r����+935yh�!�d`z2�W#FE˟�� ����Ɖ�����=+?[���t׹�1��.(���d�М�²�q�7.T�U�&���[ZO�sp�8��2I?�p:��c������ۿ���A�\'��y�X�s,w�;O�Ԑ9c����kɧ��r���90¸�O�ӥrJ��x�{�����-�gk��p�w�����V��AXZa7d���w����jh�&1�g�$���]���O�_���6)u�c��n�s�`x ��\\j�zp����uվXH�ϸn\n�������\\I7��F@h�D-�\0|��\\��ݥ�\ZB�\"�~l��H�^0N;���h�|���V�I���NՍ\0�ُ\n����I�i�\\�lJ�2�=�Jc��\r�>n}*�<4�%���͔�9`7\n�>T��6Q�m��9� �|�k�|���Ʊ����������\0��R3���������@;֍���>ob+*ͪ�s�����#���n�I�WE�sM\Z1�I�g�WC��G\n+���V\'C���\0�w�j��UQ!# *�O�hA�J4Rp�泒L�I���fQ�)�.e����r�ҡ��b����l�ͫ����ۑԓ����\0���o\r���I\"|O\'�������Z�n��0\n咳;�˙\\�`�.�p\\��s=�Q��L�3���N	��W�\\>��0\\m=�+�o��-�T���	��&H�G=���CZ�^K��F\"3��^��G56��s���rO����ϦH�\0�6�#p=3���v�o���VYp���Rr����pz��c�-�Y�\0��}y���5�!����=z�j%\ry��d�ũ����]�\0j^�_͎��I��R\\\r��\0�����t��[�4H�)x�P�rv=@-�>�`��u7��S�ᵺ�,ra�����ӑߏcV��\nhW0D�6����+�`�60��B�8�Ӟk��e%g�Ŋ^�)���B�)m�7[�ZFYU|���m㑓��7�t�G�%��mMYYt`�r��x={��GZ�.��7��|����k��=ўMFM��|���\0�<��ۺ<�z��s�t�:�T���,��B!l܀�J�=�y��.!�-��\n�;�2��}+���a�v�O6`>U`@����xn�\0w ����/���]L?��)�K�D���]��-�A����:U�����K����z�U�5(��S�R�L��VN��J�V��Qmi�X�A�1�Q�Uiu8�$\"���4��~\'&�]\\�}�� ��5��v���<��Tݲ�0�q{�i��s�k�#H�G�D�����+s�W��:A5�gv�E�F}��9�������~a�c�ۑ�ו�#�å�ʐ�D�6)˧��>wٖ��m��$��ށ�g�Үh��u)��m��>��]<Z�昡D��ی7;F1�zb���+nn��n�6���T�_�m�?N��xZh��൹�6�NvYI*��:�+��}*i�T�F�VQӟ�X�$[k�����\'����)7�%bgMN��L��|?�,h��Z�ĭ�T����N�⺿	A46�E5����t�z�����2����`��FU����?�z\'�/n�c�[���ͤ�Fwg�\n����e�Tޅ\'9��THJ�:Ԓ0�5�\Z���,�Zڠ_���#w�A�۟¹V��\Z���n�@��O\'�z԰-��̰�g�d��e�x��:���O}�#<�`�L��={��{b�y���f9¨�<g���\r�H�iXf�ģ���1�����Z�<���a���OA�\0֮��Mfܒ�\'�V�w#��W�(�^_��_�p1�S���ď��k[�w��92����C���N�9.�I#Ba��}?�P]��Ƨ�F6`��pOָ���\"��m��fp\nz������u�߼o희x͍�VR�ڬ�9�ў�d_����n�_5{hZi��\n�I�\"N��}kt��k�DC\'���Z��/ދ:ib4�1.�i�8ҟhg�x�@�[�Fy�\0\Z�Y]��\"��P7�m����+kZݼs#5�$=���9�ǹ\\z����V)�{̡o�[� W�&3���}?*����eMTy��|�n9���T�_��%ҳXK5��mC���:�~l���KᏅuM��|b�&��B�H�7pF2;w�����Nd�GP��U��nt^}��V��=���3߯\"��\Z����b����l�뵟����_sI�r�����S�=�Ł�EÂP�����+Ё��#�kg�JniWs�z~C���i�\0���H~��j0c�C��03�IIQ�����\r\'́�g�R�{�Ns���Z�?ԵXڞ��-��^k$0��4_5����\'�ox��\\_��:�����V�Zӊj�\n���\Z��Y��2`���!^��j��1Z%�\"nt9,{�����>\r�\0������\0�K^���UU�B���Yx���f\n�eI��t\Zs��B���^\'}�\0��E�u�^\r�\0�I��O�E8�$�j����','NADA','1212'),('2013953416','CIDRONIO DE OLIVEIRA','14/11/1989','Administrador','MTIzNA==','4d2dc4a5','SISTEMAS DE INFORMAÇÃO','����\0JFIF\0\0\0\0\0\0��\0C\0		\n\r\Z\Z $.\' \",#(7),01444\'9=82<.342��\0C			\r\r2!!22222222222222222222222222222222222222222222222222��\0\0s\0M\"\0��\0\0\0\0\0\0\0\0\0\0\0	\n��\0�\0\0\0}\0!1AQa\"q2���#B��R��$3br�	\n\Z%&\'()*456789:CDEFGHIJSTUVWXYZcdefghijstuvwxyz���������������������������������������������������������������������������\0\0\0\0\0\0\0\0	\n��\0�\0\0w\0!1AQaq\"2�B����	#3R�br�\n$4�%�\Z&\'()*56789:CDEFGHIJSTUVWXYZcdefghijstuvwxyz��������������������������������������������������������������������������\0\0\0?\0��(����(��(��(��(��(���\0�F��kv�]j�h,���0p�O�RF3��pq�k:������fU�����7R��l�+�:c�\r�jl�Z����J�\06�z*�\0��@+:�8ݚR��K�K���3\\��]O�Ģ<�*���O�}jx��ٺ0��I�c�3�+\r��P�}yϧ�[�F4\nJ��|9m*��[D�T�̃$zf��3�N���#��5�;]�[�:�9�a���+B�q�n��^;�-�e��;�\"���F����X�E9V\0��M5tqI8�1�QE1Q@^5����C.�SW��7Q]?B��H���!�q۽{��崱%���)�#�y�s�W�X�sO�Ӓ�X��(7l�|�r�d��μ4%~duZW�����\Zʸ$\0�TuZ}��%���� �ϦI�m4Ĳ�;{m�0��\0\0���\09��A��b��ћ�,B�8�}x��%%{=��E�<�Ɗ�x�M�Q�ec��Nq�E}��6�f[�y+�ʼ��k�/��7��� ���	�{�WA��I�w��Gu�Rc.s�z4gx��n\"���;�(��9(�tY��2��d^s}��\\��rH���x玹����z����E�i�q�jv委�C�Y�F�����\'g\Z�R�7���h�{෯�ݙ��q*��2j�����F<���0k:��@H��Wpp|���Xf��Q�a݀K����-k��.S�Ԣ�[�%��␪]a�8��#�W�i��|6v�(�(�������S��5i㶛�O&y��7՘n���p;q��j�^�G�R|�l(���2���Yi\Z|�څ�v����C�?����^O�?�:}�x|?`�R�@���#����`Fz�#����/�k�\n�d��q�3���>��ߗ�x�4���A��$Y\"��$Kg-��o������Xn\'�֧�Y���&���e��.����#��}q\\\0�����5��\0K�@l���\0�O@��������&v�\"���s���?¶.���\0i�:��g�Ѵ�!�1�#׷�8�\\���o�[çF�\0j�t�\'w\'c�}�=G���Uo��$���͖�ӣ�]6��]��&1��̓���GL�(FM����S�R�7�_I�jwW�\\��^��$�=����?|Kፉi~���E��2D\0\0r�g?)��q\\q�N\\��ny����עj̖��M�\\�\0HN�X�>�2�$�\0r��pO���,2(d�6�B�+���֕����.���ZBͼ�op�l��\0~T��m�$���u�*�A(@9*TI���^w[�2���_RK�q�Na���	��|�G5�@ɠ�z��y��k��lq���	�\0�m�&��J�Օo`g (u\'=1�/mJ�NI3�����X�qz\'�J9�����y������.�\r�af��8X�\n\0=3ԏRk��5���\"�!�rϻ �3�N+�	��h�f��未Q������@�\Z��ړ�9���8�.s@6��4�<��JXN1Q�XךM�JL�Ca���f���i��\"�,k�� �\0~Mڹ��n�`	�\0��1J9�����j�����)�0���\'l*��-�P�Ni��O\\T6��1ҧۓ����w\'�A��(n���4Q@�u�<t��\0A֫���>��:��P3��','CIDRONIO','2013.2'),('2013961211','DEYSE THAINA VIEIRA DOS SANTOS','20/07/1995','Usuário Comum','MTIzNA==','ab381b2b','SISTEMAS DE INFORMAÇÃO','����\0JFIF\0\0\0\0\0\0��\0C\0		\n\r\Z\Z $.\' \",#(7),01444\'9=82<.342��\0C			\r\r2!!22222222222222222222222222222222222222222222222222��\0\0n\0m\"\0��\0\0\0\0\0\0\0\0\0\0\0	\n��\0�\0\0\0}\0!1AQa\"q2���#B��R��$3br�	\n\Z%&\'()*456789:CDEFGHIJSTUVWXYZcdefghijstuvwxyz���������������������������������������������������������������������������\0\0\0\0\0\0\0\0	\n��\0�\0\0w\0!1AQaq\"2�B����	#3R�br�\n$4�%�\Z&\'()*56789:CDEFGHIJSTUVWXYZcdefghijstuvwxyz��������������������������������������������������������������������������\0\0\0?\0�b)��J�m��h�\"�&�i�\"�E`k�0Ӵ@��ܯH������]�Nդ-�x����,3��[��ը����=f���;��s��-�3�YF����C�<A����]��FL{������\\5J_$�)���+��!%&)��T��z�T�M\"��n��S��h�Ɠ\\���L�U����}�L�������OjOcd�B�%�p��Oב��NCuv�dy�F9-���&��KaI�̸�K�K1c����5_\r,�Q�s�8jH�N���|\n�}!Esq^��J�g�u�I.}�+�f��GBɷ��Oֽ.K!���V&�`%�H�:�⣟��=4.xC�	S��#�[�9�\0��ƽ=Y7)z����kk����\\������M����H]�!�Q��=����}�%ѝѦO��^qc�+O�!����2�)�����-_��\0g*�?�� ��C[WV�%�ɇ7���fx-��e	�g�W\0p���|er����\"rT��ӓX/��4?.z�ֽ�<yi$CܛE�\\��7����k� ���\\zW�h�\Z��\r�\n�$�J�{\rT�,oi,jx�ݩ��k\r��\0`\n��+y�gg�@\'�꒢�|�@q����?Q�M2\'�rH�@wX�U$��ǭ$��RvZ���-���1�w8��YQ޽��-�9N\n�r=�k�x����-�0�=k���He\n�q�F}z\Z���f2_i�\0�]���X]H��flc\'֐��,�\\C�h�9������k��Շ-G��B\0�\Z��i�S`+hQ%��ă~�����zW��C�	�c�ݡ�B��,}:c��5�5Z����ľ!�5���6�|��9�F�Ы	%8�8��|Kumn9 �W\"=��7(sК�{ۉd�P}zש���I���<P��H�YNT��N�Zk�6�O�mc�>��>܊��$���g���-c�/5�w�֩��\Z�<��]�<�iF���J�+%�Tf�9YI*���Hϩ�T��#�vX\n�� ��S��eJ����j�up���=k��Ta�R�[Y7����\\\r�0��y��O����D�=�J���\r�\"Y��x���c|���$�s��Qv��UdW�_wq�d����G���	צG�^�^\'�E��|Gm$�G���U�<�?)\r�<��k�;W����.DvQ�����r�g/�]\"hm�����c��N�O�]&�kuy��\r�Ǒ9_���o�O�=2:~�[�r���\0��t���������wfk��1�\'t|�,��7WQ4r��ۏ���k�����;W�x����$�yTyWѮc���wϯ^�+�/�n,e�����C��Һ���V:nF׃�=b���4�L��1/ޑC�� u%~��E�����(�\r�3�zr+��Ya���g���M����w�S\r�/�Y�{�^_�/A�|G�-�KO������R�M��v�c�Ms2��GFu�d��D���YH6�ZP��#t��XtԀ���]�˃)S\ZOE<�u��]ݶ�:8��ɭil��-����RIV[��-��@�@��V߂�C��\Z�}R�S�Frcc�����ĂO������ZK� ~�qZ�k�J��P$b3�<�\0ZP�30���]�]jV�x���8u{�d��@Ӓ�=��=��ʊ򟆾m�wc:���y=��� ��O�z�E�K|����vx����i��e_26�y�XLI�ܨ�\0�Mk�����cm:Ȋ\\�l%ߖe+�ve��\'9���z��x��f4^�CҼc�T)���\n���ى�A5��+/S�a��Y$72��$�oǧ�n��p�}���ڹ���*��5o5��y�tf%�ƌA#1��z�<����;<�ř��=I=�v���?N��\Z��%�HY>���c�V���Ӱۀ\rq#�{�\Z�y��瞎�U�}b8\\Z]�Qx?��?ʽ+Y$�y�l�׋�A8\'�z�|-�I%�ĥ�FOq�SV��FԪ��vVx^�\ry���X��2�m<�\0���^��^d�w s�Z�<{j�E�x&\'����\0�V4���Ux�7��Ml4����R>��O0��A߁�ע$�([��Ӛ��\Z]Ǳ���瓗1��|��sF��^)��ˡݭ���>���u�I9�\\u���x>�MpV�*R�5�����\'S�I�fMN��`�H�Z@��Tb{�$}\rw�<W*\'�E�)>du9B\rye���<���&ꮏ��|8�Z�|.s�01��\0#\01\0rOa�]��HN+��3��\'ֵ�N{��\nDTe��*����7��\0[��mb�>Yl�N��έ|P�^��Kd,�.�й��~�����^	R[�jM������;�������Uu����j�Hn*T����ᔂ�EV%��&̯,i��Mh�Q�\r��%�)7���Wu+e���dRw&�W�Y\\Ki,7�$NFzc^��߮������I �9�=뒬9��J�:���c��7-�@�[�b�u+��A#c󪦺���Vv:������-6v\\7��s�����k�W޽W�n�=Ɨy��\nZH�\'�}�����:��Iٟ��','DEYSE','2013.2'),('2013961698','FERNANDO VIEIRA SILVA','01/01/1991','Administrador','MTIzNA==','93581b2b','SISTEMAS INFORMAÇÃO','����\0JFIF\0\0\0\0\0\0��\0C\0		\n\r\Z\Z $.\' \",#(7),01444\'9=82<.342��\0C			\r\r2!!22222222222222222222222222222222222222222222222222��\0\0t\0W\"\0��\0\0\0\0\0\0\0\0\0\0\0	\n��\0�\0\0\0}\0!1AQa\"q2���#B��R��$3br�	\n\Z%&\'()*456789:CDEFGHIJSTUVWXYZcdefghijstuvwxyz���������������������������������������������������������������������������\0\0\0\0\0\0\0\0	\n��\0�\0\0w\0!1AQaq\"2�B����	#3R�br�\n$4�%�\Z&\'()*56789:CDEFGHIJSTUVWXYZcdefghijstuvwxyz��������������������������������������������������������������������������\0\0\0?\0�*�GS,u(���+��~����~�����\"��N#����.V�D^�k����@D]�G��V�tyt�D�ފ�c���T�*EJ�G�L������8�S�ꖯ�äY���uf��[�&�D�)�kϮ��\Z�[噒��0{q�}�f$�ƌ���h�9![*~��s,]7.TΧ�������)�>=��� Mnْ@�u�@~����\0?κ1�t�_Tr�ӱ_�����Ȏ����pE3�h��E���H#�U*A\\�%q�%�3�o�4��(E�7�O�������u�2]M!|2��=����<mNZ|��C.��S��NB�w$[0�d^_�)h��s֥kSeg.�,�}�Z�XeT¨$��Fr+ȥM)6{5�6�M\rJ��-0N�F@<0n?�ҽ�R��A�I5�+�b���8�1�~\'�yc�r��O�2�.�QVD~Ծ_�ks������E���Ԣ:�#(��1+�u��(��\rY�Ǒ��7g�\0����r�3�4[iG�ߘ7�c�5ˋIӿc�&�۹�wʱ�r�;�C�E��#�f�c�s�M���/b��w\nw&��+�^nڝ\'��K��R�w�D��y�ʐ��<���zR�O��K{x�L�B���:���AX�j�u%r/ڗeX��uW ���e���`�*�qҥԈ��\".�rzV���\\(�n�D[8�;űo�]�?�\n�Ӓ�w����`8�����Ʀ�N�#�o3 �������\\�傹��p��盵�2��ܒr�{\ZM9����N���9U�c���_�z[x62���UW��rq�S��|=ab�H �����}y���a�r�r:�<�5M���`�}U���pG\\�qO��1C�8�9��Z�:�2�����u����+�S���ʋ�5tl������r�H��1��Ƭ��\"9J�(���S�)�2�Nq���\0\"�*$d})���Wp���Ov�3^<�9���i��C�d��\'�!�y�S!$J�=9�i��ڨ��#�<5Rt�.����c���T��Yn.��a1Ϯ01�Z����kQ\r����>U@�Bz�>���\Z��\\[����>�ѳ�$�\0!B$*\n���_��Vl�b���������ZQ��\"�4֧=��� �m�7pG����_����y��J�$V4$\r�q��O#�k��\"�EE���5�Pӭ��-FH �J��W99$�v�An���J��G����g{�x�N�o�.�ͻ9����\\���3�b�>M].���A�y���Bg�>\\v��NCt��z~���Y��%�=M>I?{��:�i�ɖc�2�S�o6�t?��y��\\��fs.�lT�p���2��T��Nv��{�}GК&��=��\r>Q�\"��(��s�5e$\0��Zǵ����9�a��ɦ������C���8>�&����F#��^b��`�9<�\r��=�APO�#���T�FM��f`�$�\\g��d���bFiNW8�?��^�>��V�K�a�6�f,������ש;ƛ8 ��rO�j]��{c���@]�F�6<���Ǳ��W<�ߓ;��__����[�2)� �g$g��ى��v4Q\\T>�mS����NT��pO��2(��n\"2�j��Ϥ��Ċ\0!�?����:1�z����w�#\0���$�v�Z�.�.!v�x��A#ӊ(����k|��=����K+���\0���o�e�?��:�|��Q^��\0��G�K�����w�\"��&��QE�ɵ��F)���','FERNANDO','2013.2');
/*!40000 ALTER TABLE `cad_usuario` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `configuracao`
--

DROP TABLE IF EXISTS `configuracao`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `configuracao` (
  `cod_config` int(11) NOT NULL AUTO_INCREMENT,
  `porta_com` varchar(20) DEFAULT NULL,
  `boud_rate` varchar(10) DEFAULT NULL,
  `app_key` varchar(256) DEFAULT NULL,
  `app_secret` varchar(256) DEFAULT NULL,
  `token` varchar(256) DEFAULT NULL,
  `configuracaocol` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`cod_config`)
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=utf8 COMMENT='armazena configuracoes da comunicacao serial';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `configuracao`
--

LOCK TABLES `configuracao` WRITE;
/*!40000 ALTER TABLE `configuracao` DISABLE KEYS */;
INSERT INTO `configuracao` VALUES (21,'COM4','9600','60kjebkk5wre1wv','60kjebkk5wre1wv','l13VYmmWJF0AAAAAAAACE0-XX_18t5dThEWGkmDAfPduixNwAPs5q0kN5Z2pDeO6',NULL);
/*!40000 ALTER TABLE `configuracao` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `controle_acesso`
--

DROP TABLE IF EXISTS `controle_acesso`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `controle_acesso` (
  `COD_CONTROLE_ACESSO` int(11) NOT NULL AUTO_INCREMENT,
  `COD_USUARIO` varchar(10) DEFAULT NULL,
  `COD_MAQUINA` varchar(5) DEFAULT NULL,
  `DATA_ACESSO` varchar(10) DEFAULT NULL,
  `HORA_ENTRADA` varchar(10) DEFAULT NULL,
  `HORA_SAIDA` varchar(10) DEFAULT NULL,
  `NOME_USUARIO` varchar(80) DEFAULT NULL,
  `STATUS_CONTROLE_ACESSO` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`COD_CONTROLE_ACESSO`),
  KEY `FK_CONTROLE_REFERENCE_CAD_USUA` (`COD_USUARIO`),
  CONSTRAINT `FK_CONTROLE_REFERENCE_CAD_USUA` FOREIGN KEY (`COD_USUARIO`) REFERENCES `cad_usuario` (`COD_USUARIO`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `controle_acesso`
--

LOCK TABLES `controle_acesso` WRITE;
/*!40000 ALTER TABLE `controle_acesso` DISABLE KEYS */;
INSERT INTO `controle_acesso` VALUES (3,'2013961211','0001','27/06/2017','14:58:24','14:58:59','DEYSE THAINA VIEIRA DOS SANTOS','DESLOGADO'),(4,'2013961211','0001','27/06/2017','17:40:57','20:52:10','DEYSE THAINA VIEIRA DOS SANTOS','DESLOGADO');
/*!40000 ALTER TABLE `controle_acesso` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping routines for database 'labsys'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-06-27 21:52:50
