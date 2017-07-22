-- MySQL dump 10.13  Distrib 5.6.23, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: labsys
-- ------------------------------------------------------
-- Server version	5.5.5-10.1.13-MariaDB

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
-- Table structure for table `cad_backup`
--

DROP TABLE IF EXISTS `cad_backup`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `cad_backup` (
  `cod_backup` int(11) NOT NULL AUTO_INCREMENT,
  `nome_backup` varchar(150) DEFAULT NULL,
  PRIMARY KEY (`cod_backup`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8 COMMENT='nessa tabela será armazenado os parametros de configuracao do sistema';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cad_backup`
--

LOCK TABLES `cad_backup` WRITE;
/*!40000 ALTER TABLE `cad_backup` DISABLE KEYS */;
INSERT INTO `cad_backup` VALUES (1,'22-5-2017.sql'),(2,'25-5-2017.sql'),(3,'26-5-2017.sql'),(4,'26-5-2017.sql'),(5,'26-5-2017.sql'),(6,'26-5-2017.sql'),(7,'26-5-2017.sql'),(8,'26-5-2017.sql'),(9,'26-5-2017.sql'),(10,'26-5-2017.sql'),(11,'26-5-2017.sql'),(12,'27-5-2017.sql'),(13,'27-5-2017.sql'),(14,'27-5-2017.sql'),(15,'27-5-2017.sql'),(16,'28-5-2017.sql');
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
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8 COMMENT='nessa tabela será armazenado os horários de cada monitor';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cad_horario`
--

LOCK TABLES `cad_horario` WRITE;
/*!40000 ALTER TABLE `cad_horario` DISABLE KEYS */;
INSERT INTO `cad_horario` VALUES (1,'08:00:00','10:00:00','CIDRONIO DE OLIVEIRA','FERNANDO VIEIRA SILVA','CIDRONIO DE OLIVEIRA','FERNANDO VIEIRA SILVA','CIDRONIO DE OLIVEIRA','FERNANDO VIEIRA SILVA'),(2,'10:00:00','12:00:00','CIDRONIO DE OLIVEIRA','FERNANDO VIEIRA SILVA','CIDRONIO DE OLIVEIRA','FERNANDO VIEIRA SILVA','CIDRONIO DE OLIVEIRA','FERNANDO VIEIRA SILVA'),(3,'12:00:00','14:00:00','CIDRONIO DE OLIVEIRA','CIDRONIO DE OLIVEIRA','CIDRONIO DE OLIVEIRA','CIDRONIO DE OLIVEIRA','CIDRONIO DE OLIVEIRA','CIDRONIO DE OLIVEIRA'),(4,'14:00:00','16:00:00','FERNANDO VIEIRA SILVA','CIDRONIO DE OLIVEIRA','FERNANDO VIEIRA SILVA','CIDRONIO DE OLIVEIRA','FERNANDO VIEIRA SILVA','FERNANDO VIEIRA SILVA'),(5,'16:00:00','18:00:00','CIDRONIO DE OLIVEIRA','FERNANDO VIEIRA SILVA','CIDRONIO DE OLIVEIRA','FERNANDO VIEIRA SILVA','CIDRONIO DE OLIVEIRA','FERNANDO VIEIRA SILVA');
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
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cad_lista_equipamentos`
--

LOCK TABLES `cad_lista_equipamentos` WRITE;
/*!40000 ALTER TABLE `cad_lista_equipamentos` DISABLE KEYS */;
INSERT INTO `cad_lista_equipamentos` VALUES (1,'28/06/2017',24,24,24,24,8,24,8,24,24,2),(2,'28/06/2017',24,24,24,24,8,24,8,24,24,2);
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
INSERT INTO `cad_maquina` VALUES ('0001','HP','MINI TORRE',363523,'WINDOWS 8 / LINUX','INTEL I5','500GB','4GB','1GB','19\"','Funcionado','O',''),('0002','HP','MINI TORRE',162092,'WINDOWS 8 / LINUX','AMD CORE 2 DUO','500GB','4GB','500MB','17\"','Funcionado','L',''),('0003','HP','MINI TORRE',168273,'WINDOWS 8 / LINUX','INTEL I5','500GB','4GB','1GB','19\'','Funcionado','L',''),('0004','HP','MINI TORRE',905863,'WINDOWS 8 / LINUX','INTEL I5','500GB','4GB','1GB','19\"','Funcionado','L',''),('0005','HP','MINI TORRE',387463,'WINDOWS 8 / LINUX','INTEL I5','500GB','4GB','1GB','19\"','Funcionado','L',''),('0006','HP','MINI TORRE',938474,'WINDOWS 8 / LINUX','INTEL I5','500GB','4GB','1GB','19\"','Funcionado','L',''),('0007','HP','MINI TORRE',484746,'WINDOWS 8 / LINUX','AMD VISION PRO','500GB','4GB','1GB','19\"','Funcionado','L',''),('0008','HP ','MINI TORRE',864723,'WINDOWS 8 / LINUX','AMD VISION PRO','500GB','4GB','1GB','19\"','Funcionado','L',''),('0009','HP ','MINI TORRE',384732,'WINDOWS 8 / LINUX','AMD VISION PRO','500GB','4GB','1GB','19\"','Com Defeito','L',''),('0010','HP','MINI TORRE',583832,'WINDOWS 8 / LINUX','AMD VISION PRO','500GB','4GB','1GB','19\"','Manutenção','L',''),('12','EQWE','J',7,'W','J','S','M','M','M','Manutenção','L','D'),('QWE','QWEWQE','QWEWQ',123,'QWE','QWE','QWE','QWE','QWE','QWE','Com Defeito','L','QWE');
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
INSERT INTO `cad_usuario` VALUES ('1212','1212','11/11/1992','Usuário Comum','MTIzNA==','1212','1212','����\0JFIF\0\0\0\0\0\0��\0C\0		\n\r\Z\Z $.\' \",#(7),01444\'9=82<.342��\0C			\r\r2!!22222222222222222222222222222222222222222222222222��\0\0i\0m\"\0��\0\0\0\0\0\0\0\0\0\0\0	\n��\0�\0\0\0}\0!1AQa\"q2���#B��R��$3br�	\n\Z%&\'()*456789:CDEFGHIJSTUVWXYZcdefghijstuvwxyz���������������������������������������������������������������������������\0\0\0\0\0\0\0\0	\n��\0�\0\0w\0!1AQaq\"2�B����	#3R�br�\n$4�%�\Z&\'()*56789:CDEFGHIJSTUVWXYZcdefghijstuvwxyz��������������������������������������������������������������������������\0\0\0?\0�mf�	��V�Ӯx#����:֍�����o:HGU=py�p�N�ȉDm6䁸�ێ}1׽+i�1:x�n�f\0q����������S����[�O�;����\'�N8��8�W����ҼP��xܬ@O��~Y�;]c_��v�A�\\��r:��#�9��qje:t��͏N�An��+����޵[����5��7$Q	Y��N�YW���\"�oRnvnr��зs�c�������#��-�N��yܫ6�����\0���v�l�J<��=�0�Ʋ#G����s�+����`��q����v����V��o4�ౖ�n�\"��X�<����5�E�j�w�#X�`v�&�3���w���\Zz��$�=\"����+���2.훷`v���jV�wC2�����1�n9�q��r����i�{b�;A,�0��A�=_ʹy5�ۡw,������쀫q��Ozj��ԕM7��I��K��eaс�i�\\W-u���^�L��y0�w�9Q���=~�ܶ�W���~\\`���c���0O\'����tѼG�d�K�9���Gɚ9v2#�pv�ݐq�׍x�]�Z����H�di\Z	r0�O8�~��>�1���*�C4.�,���V���jqh��\0{*�PpA�8�rj�����8����Q�!e�H1�����.b��_��9�Զ��ۙr_QY�K?=�\"�h&�\n0��d�U��.H����<՘m�r\"\'���T!�:ȣ88^~�v�.��)��l�%r(�M1H+��r P�i�s&\r�\08>\\����u|`\0��2=8С���$�r?�)�Nc�7��b�̃i\\H��ŏ|~�Jh�ab�;�c�����ϭt��\r����T����ʿ>�6|�w�s��2��p2x#Ly��H`@P꣓��T\Z��Va)mwy,$\0gv9���]l��ɀ��;��\r5�����uE�=;��cU\'���-ü����s:����צ|!�Ή��V���y9��y��Z������m���2p}8WS��Qn/�p�n1�\Z��n�OZ%$Ս!RMٳ�����p8�q�f<��G���UN2&\0��\\Ye+��vR0rMt6�)2���D��8����D\\�b����\0��d��`�q�m�Y[�0�Fc�\r����+935yh�!�d`z2�W#FE˟�� ����Ɖ�����=+?[���t׹�1��.(���d�М�²�q�7.T�U�&���[ZO�sp�8��2I?�p:��c������ۿ���A�\'��y�X�s,w�;O�Ԑ9c����kɧ��r���90¸�O�ӥrJ��x�{�����-�gk��p�w�����V��AXZa7d���w����jh�&1�g�$���]���O�_���6)u�c��n�s�`x ��\\j�zp����uվXH�ϸn\n�������\\I7��F@h�D-�\0|��\\��ݥ�\ZB�\"�~l��H�^0N;���h�|���V�I���NՍ\0�ُ\n����I�i�\\�lJ�2�=�Jc��\r�>n}*�<4�%���͔�9`7\n�>T��6Q�m��9� �|�k�|���Ʊ����������\0��R3���������@;֍���>ob+*ͪ�s�����#���n�I�WE�sM\Z1�I�g�WC��G\n+���V\'C���\0�w�j��UQ!# *�O�hA�J4Rp�泒L�I���fQ�)�.e����r�ҡ��b����l�ͫ����ۑԓ����\0���o\r���I\"|O\'�������Z�n��0\n咳;�˙\\�`�.�p\\��s=�Q��L�3���N	��W�\\>��0\\m=�+�o��-�T���	��&H�G=���CZ�^K��F\"3��^��G56��s���rO����ϦH�\0�6�#p=3���v�o���VYp���Rr����pz��c�-�Y�\0��}y���5�!����=z�j%\ry��d�ũ����]�\0j^�_͎��I��R\\\r��\0�����t��[�4H�)x�P�rv=@-�>�`��u7��S�ᵺ�,ra�����ӑߏcV��\nhW0D�6����+�`�60��B�8�Ӟk��e%g�Ŋ^�)���B�)m�7[�ZFYU|���m㑓��7�t�G�%��mMYYt`�r��x={��GZ�.��7��|����k��=ўMFM��|���\0�<��ۺ<�z��s�t�:�T���,��B!l܀�J�=�y��.!�-��\n�;�2��}+���a�v�O6`>U`@����xn�\0w ����/���]L?��)�K�D���]��-�A����:U�����K����z�U�5(��S�R�L��VN��J�V��Qmi�X�A�1�Q�Uiu8�$\"���4��~\'&�]\\�}�� ��5��v���<��Tݲ�0�q{�i��s�k�#H�G�D�����+s�W��:A5�gv�E�F}��9�������~a�c�ۑ�ו�#�å�ʐ�D�6)˧��>wٖ��m��$��ށ�g�Үh��u)��m��>��]<Z�昡D��ی7;F1�zb���+nn��n�6���T�_�m�?N��xZh��൹�6�NvYI*��:�+��}*i�T�F�VQӟ�X�$[k�����\'����)7�%bgMN��L��|?�,h��Z�ĭ�T����N�⺿	A46�E5����t�z�����2����`��FU����?�z\'�/n�c�[���ͤ�Fwg�\n����e�Tޅ\'9��THJ�:Ԓ0�5�\Z���,�Zڠ_���#w�A�۟¹V��\Z���n�@��O\'�z԰-��̰�g�d��e�x��:���O}�#<�`�L��={��{b�y���f9¨�<g���\r�H�iXf�ģ���1�����Z�<���a���OA�\0֮��Mfܒ�\'�V�w#��W�(�^_��_�p1�S���ď��k[�w��92����C���N�9.�I#Ba��}?�P]��Ƨ�F6`��pOָ���\"��m��fp\nz������u�߼o희x͍�VR�ڬ�9�ў�d_����n�_5{hZi��\n�I�\"N��}kt��k�DC\'���Z��/ދ:ib4�1.�i�8ҟhg�x�@�[�Fy�\0\Z�Y]��\"��P7�m����+kZݼs#5�$=���9�ǹ\\z����V)�{̡o�[� W�&3���}?*����eMTy��|�n9���T�_��%ҳXK5��mC���:�~l���KᏅuM��|b�&��B�H�7pF2;w�����Nd�GP��U��nt^}��V��=���3߯\"��\Z����b����l�뵟����_sI�r�����S�=�Ł�EÂP�����+Ё��#�kg�JniWs�z~C���i�\0���H~��j0c�C��03�IIQ�����\r\'́�g�R�{�Ns���Z�?ԵXڞ��-��^k$0��4_5����\'�ox��\\_��:�����V�Zӊj�\n���\Z��Y��2`���!^��j��1Z%�\"nt9,{�����>\r�\0������\0�K^���UU�B���Yx���f\n�eI��t\Zs��B���^\'}�\0��E�u�^\r�\0�I��O�E8�$�j����','NADA','1212'),('2013896544','FRANCISCO RAMON MENDES','20/06/1980','Usuário Comum','MTIzNDEyMzQ=','eeff8d85','SISTEMAS DE INFORMAÇÃO','����\0JFIF\0\0\0\0\0\0��\0C\0		\n\r\Z\Z $.\' \",#(7),01444\'9=82<.342��\0C			\r\r2!!22222222222222222222222222222222222222222222222222��\0\0t\0W\"\0��\0\0\0\0\0\0\0\0\0\0\0	\n��\0�\0\0\0}\0!1AQa\"q2���#B��R��$3br�	\n\Z%&\'()*456789:CDEFGHIJSTUVWXYZcdefghijstuvwxyz���������������������������������������������������������������������������\0\0\0\0\0\0\0\0	\n��\0�\0\0w\0!1AQaq\"2�B����	#3R�br�\n$4�%�\Z&\'()*56789:CDEFGHIJSTUVWXYZcdefghijstuvwxyz��������������������������������������������������������������������������\0\0\0?\0�H}�^��LS���Դ�k�\n<�Պ�n�q�ϱ��&,͎�j��EV�֣h�E��x�YiJS\Z3�1W\Z:���b��u�F������8 T,���6��@��h���b��-M;\'4P#cA��S�YdT�o>\0хQ�6ю�0q�p7#�h�䞹��E��Ze�؋>�)62Hޟ^T��n�|V��M��@����PI>ԙH�d�ҳ5=F�J�λ�F��q�\nֺt��I�;c�K1�a�x��<Ay��X��`F;�;���t7c]@�V�������淴_��A�M�U�Q�8��mipc\0*m>�[ȧ��9\"����fS��D��i�i�i��DF�0�J�)�L�T��E2N�^���E��ܰ�U�`+���C\'Q�����N��}��jʓĲ���\0�h��c�����aU�r�(f)>u#���\0\0�,��P<u}������x��X�&�=�T��j��?�U�Q�6(�<��\n�>#�����|��Ъ�噳�\0�ʼ��i�$\0sǽf�Έ7tt��[m�v��s5��۾6>��U�;u��&X�5���[�QP����&�G�x\ny��.4�0�s��� _һ�k�|+!��ZYbp����*@�k�6V�c���(�v�e���*�����d��m�Cep�v�j�weD\'�\0%xu��yU��XKs�ΰ {���a����9�Y@=8�:�-���B�J�n�]��s��d#`���$T�#�|u{k}��5�f0��Cؕ$��D~�\r�#O*1�(��\n�|O�6��ꐜl�o�Ņ��~�-�¸}Fe�����:f�i�wA�+\"�_yӤl��8�q�h0���ʫ%£����*�ʳ aPՇ{�hh��&���Hb�R���T`dd���c��+��t�OP���2�!�1���d�j�kk����0JC\Zƻ��\n��ַ)4G�}��v9�w�\ZkA��E����7:Cm!��#>S|˅e��3W:��W���z�����=����E21n�@�	���2׾:�K�-N��u\\7���`)pw�9,;���n���n-.5+HnTy��$��g���\'�+�u�Z�mnⲍ���4��I%�t�?��I�=s�D�4�NiOEb����+��5sN����(@2�\"ƀ�e����z�����d�U��Ap���8=�&�J��R�l�;D����ƍol�j1��1�,@�#$�Ϡ�f��y߆>3��V:դ�8�Ϙӆ!NKq�g{�\'�z~�{��+y���un���l�8:�`���3ȭ�q97�(5��J+e�=�������a𽱴�)&�\"�\"�}��}�k�6�u�����aJ��@�F�\n��ڜ���=��^I�s\\��k��CC��J��Ae��`�X����5#�MV�s=�ȿu-f��G$`sVCg�f� v�Y�#4��U*�7L�8�PO.���j\'�,0�	��y&�0�쪵�VC���W㝃H�Y�֧Bx�U�1\r��N񿈬Dk�~�ġ3;2(\0m\'��x۵�9\Zw=\n�t\r@��7C�������t�t���ܧ������K2�֝$o������\0>��y�wT�R�9\\sU��g�n}��PҢ���5RV3��A�\0`��(u�b�(��B�ާ���Ue84��3��@�J�xS�ɤ�d U	25\\Ԩ�ʝ\Zv�Q�[��Dѽ�BGJ+��t��fyT��zsES�C$��j(��]��v��� B.�8;S }zn:��҉u�S��3�TU����8�X�f\0�4QY����|��*��?��EP���?J(�$4V������a���EhOrH�1[\Zt(�7\n(���L��������~�QEk%�����','RAMON','2013.2'),('2013953416','CIDRONIO DE OLIVEIRA','14/11/1989','Administrador','MTIzNA==','4d2dc4a5','SISTEMAS DE INFORMAÇÃO','����\0JFIF\0\0\0\0\0\0��\0C\0		\n\r\Z\Z $.\' \",#(7),01444\'9=82<.342��\0C			\r\r2!!22222222222222222222222222222222222222222222222222��\0\0s\0M\"\0��\0\0\0\0\0\0\0\0\0\0\0	\n��\0�\0\0\0}\0!1AQa\"q2���#B��R��$3br�	\n\Z%&\'()*456789:CDEFGHIJSTUVWXYZcdefghijstuvwxyz���������������������������������������������������������������������������\0\0\0\0\0\0\0\0	\n��\0�\0\0w\0!1AQaq\"2�B����	#3R�br�\n$4�%�\Z&\'()*56789:CDEFGHIJSTUVWXYZcdefghijstuvwxyz��������������������������������������������������������������������������\0\0\0?\0��(����(��(��(��(��(���\0�F��kv�]j�h,���0p�O�RF3��pq�k:������fU�����7R��l�+�:c�\r�jl�Z����J�\06�z*�\0��@+:�8ݚR��K�K���3\\��]O�Ģ<�*���O�}jx��ٺ0��I�c�3�+\r��P�}yϧ�[�F4\nJ��|9m*��[D�T�̃$zf��3�N���#��5�;]�[�:�9�a���+B�q�n��^;�-�e��;�\"���F����X�E9V\0��M5tqI8�1�QE1Q@^5����C.�SW��7Q]?B��H���!�q۽{��崱%���)�#�y�s�W�X�sO�Ӓ�X��(7l�|�r�d��μ4%~duZW�����\Zʸ$\0�TuZ}��%���� �ϦI�m4Ĳ�;{m�0��\0\0���\09��A��b��ћ�,B�8�}x��%%{=��E�<�Ɗ�x�M�Q�ec��Nq�E}��6�f[�y+�ʼ��k�/��7��� ���	�{�WA��I�w��Gu�Rc.s�z4gx��n\"���;�(��9(�tY��2��d^s}��\\��rH���x玹����z����E�i�q�jv委�C�Y�F�����\'g\Z�R�7���h�{෯�ݙ��q*��2j�����F<���0k:��@H��Wpp|���Xf��Q�a݀K����-k��.S�Ԣ�[�%��␪]a�8��#�W�i��|6v�(�(�������S��5i㶛�O&y��7՘n���p;q��j�^�G�R|�l(���2���Yi\Z|�څ�v����C�?����^O�?�:}�x|?`�R�@���#����`Fz�#����/�k�\n�d��q�3���>��ߗ�x�4���A��$Y\"��$Kg-��o������Xn\'�֧�Y���&���e��.����#��}q\\\0�����5��\0K�@l���\0�O@��������&v�\"���s���?¶.���\0i�:��g�Ѵ�!�1�#׷�8�\\���o�[çF�\0j�t�\'w\'c�}�=G���Uo��$���͖�ӣ�]6��]��&1��̓���GL�(FM����S�R�7�_I�jwW�\\��^��$�=����?|Kፉi~���E��2D\0\0r�g?)��q\\q�N\\��ny����עj̖��M�\\�\0HN�X�>�2�$�\0r��pO���,2(d�6�B�+���֕����.���ZBͼ�op�l��\0~T��m�$���u�*�A(@9*TI���^w[�2���_RK�q�Na���	��|�G5�@ɠ�z��y��k��lq���	�\0�m�&��J�Օo`g (u\'=1�/mJ�NI3�����X�qz\'�J9�����y������.�\r�af��8X�\n\0=3ԏRk��5���\"�!�rϻ �3�N+�	��h�f��未Q������@�\Z��ړ�9���8�.s@6��4�<��JXN1Q�XךM�JL�Ca���f���i��\"�,k�� �\0~Mڹ��n�`	�\0��1J9�����j�����)�0���\'l*��-�P�Ni��O\\T6��1ҧۓ����w\'�A��(n���4Q@�u�<t��\0A֫���>��:��P3��','CIDRONIO','2013.2'),('2013961211','DEYSE THAINA VIEIRA DOS SANTOS','20/07/1995','Usuário Comum','MTIzNA==','ab381b2b','SISTEMAS DE INFORMAÇÃO','����\0JFIF\0\0\0\0\0\0��\0C\0		\n\r\Z\Z $.\' \",#(7),01444\'9=82<.342��\0C			\r\r2!!22222222222222222222222222222222222222222222222222��\0\0n\0m\"\0��\0\0\0\0\0\0\0\0\0\0\0	\n��\0�\0\0\0}\0!1AQa\"q2���#B��R��$3br�	\n\Z%&\'()*456789:CDEFGHIJSTUVWXYZcdefghijstuvwxyz���������������������������������������������������������������������������\0\0\0\0\0\0\0\0	\n��\0�\0\0w\0!1AQaq\"2�B����	#3R�br�\n$4�%�\Z&\'()*56789:CDEFGHIJSTUVWXYZcdefghijstuvwxyz��������������������������������������������������������������������������\0\0\0?\0�b)��J�m��h�\"�&�i�\"�E`k�0Ӵ@��ܯH������]�Nդ-�x����,3��[��ը����=f���;��s��-�3�YF����C�<A����]��FL{������\\5J_$�)���+��!%&)��T��z�T�M\"��n��S��h�Ɠ\\���L�U����}�L�������OjOcd�B�%�p��Oב��NCuv�dy�F9-���&��KaI�̸�K�K1c����5_\r,�Q�s�8jH�N���|\n�}!Esq^��J�g�u�I.}�+�f��GBɷ��Oֽ.K!���V&�`%�H�:�⣟��=4.xC�	S��#�[�9�\0��ƽ=Y7)z����kk����\\������M����H]�!�Q��=����}�%ѝѦO��^qc�+O�!����2�)�����-_��\0g*�?�� ��C[WV�%�ɇ7���fx-��e	�g�W\0p���|er����\"rT��ӓX/��4?.z�ֽ�<yi$CܛE�\\��7����k� ���\\zW�h�\Z��\r�\n�$�J�{\rT�,oi,jx�ݩ��k\r��\0`\n��+y�gg�@\'�꒢�|�@q����?Q�M2\'�rH�@wX�U$��ǭ$��RvZ���-���1�w8��YQ޽��-�9N\n�r=�k�x����-�0�=k���He\n�q�F}z\Z���f2_i�\0�]���X]H��flc\'֐��,�\\C�h�9������k��Շ-G��B\0�\Z��i�S`+hQ%��ă~�����zW��C�	�c�ݡ�B��,}:c��5�5Z����ľ!�5���6�|��9�F�Ы	%8�8��|Kumn9 �W\"=��7(sК�{ۉd�P}zש���I���<P��H�YNT��N�Zk�6�O�mc�>��>܊��$���g���-c�/5�w�֩��\Z�<��]�<�iF���J�+%�Tf�9YI*���Hϩ�T��#�vX\n�� ��S��eJ����j�up���=k��Ta�R�[Y7����\\\r�0��y��O����D�=�J���\r�\"Y��x���c|���$�s��Qv��UdW�_wq�d����G���	צG�^�^\'�E��|Gm$�G���U�<�?)\r�<��k�;W����.DvQ�����r�g/�]\"hm�����c��N�O�]&�kuy��\r�Ǒ9_���o�O�=2:~�[�r���\0��t���������wfk��1�\'t|�,��7WQ4r��ۏ���k�����;W�x����$�yTyWѮc���wϯ^�+�/�n,e�����C��Һ���V:nF׃�=b���4�L��1/ޑC�� u%~��E�����(�\r�3�zr+��Ya���g���M����w�S\r�/�Y�{�^_�/A�|G�-�KO������R�M��v�c�Ms2��GFu�d��D���YH6�ZP��#t��XtԀ���]�˃)S\ZOE<�u��]ݶ�:8��ɭil��-����RIV[��-��@�@��V߂�C��\Z�}R�S�Frcc�����ĂO������ZK� ~�qZ�k�J��P$b3�<�\0ZP�30���]�]jV�x���8u{�d��@Ӓ�=��=��ʊ򟆾m�wc:���y=��� ��O�z�E�K|����vx����i��e_26�y�XLI�ܨ�\0�Mk�����cm:Ȋ\\�l%ߖe+�ve��\'9���z��x��f4^�CҼc�T)���\n���ى�A5��+/S�a��Y$72��$�oǧ�n��p�}���ڹ���*��5o5��y�tf%�ƌA#1��z�<����;<�ř��=I=�v���?N��\Z��%�HY>���c�V���Ӱۀ\rq#�{�\Z�y��瞎�U�}b8\\Z]�Qx?��?ʽ+Y$�y�l�׋�A8\'�z�|-�I%�ĥ�FOq�SV��FԪ��vVx^�\ry���X��2�m<�\0���^��^d�w s�Z�<{j�E�x&\'����\0�V4���Ux�7��Ml4����R>��O0��A߁�ע$�([��Ӛ��\Z]Ǳ���瓗1��|��sF��^)��ˡݭ���>���u�I9�\\u���x>�MpV�*R�5�����\'S�I�fMN��`�H�Z@��Tb{�$}\rw�<W*\'�E�)>du9B\rye���<���&ꮏ��|8�Z�|.s�01��\0#\01\0rOa�]��HN+��3��\'ֵ�N{��\nDTe��*����7��\0[��mb�>Yl�N��έ|P�^��Kd,�.�й��~�����^	R[�jM������;�������Uu����j�Hn*T����ᔂ�EV%��&̯,i��Mh�Q�\r��%�)7���Wu+e���dRw&�W�Y\\Ki,7�$NFzc^��߮������I �9�=뒬9��J�:���c��7-�@�[�b�u+��A#c󪦺���Vv:������-6v\\7��s�����k�W޽W�n�=Ɨy��\nZH�\'�}�����:��Iٟ��','DEYSE','2013.2'),('2013961698','FERNANDO VIEIRA SILVA','01/01/1991','Administrador','MTIzNA==','93581b2b','SISTEMAS INFORMAÇÃO','����\0JFIF\0\0\0\0\0\0��\0C\0		\n\r\Z\Z $.\' \",#(7),01444\'9=82<.342��\0C			\r\r2!!22222222222222222222222222222222222222222222222222��\0\0t\0W\"\0��\0\0\0\0\0\0\0\0\0\0\0	\n��\0�\0\0\0}\0!1AQa\"q2���#B��R��$3br�	\n\Z%&\'()*456789:CDEFGHIJSTUVWXYZcdefghijstuvwxyz���������������������������������������������������������������������������\0\0\0\0\0\0\0\0	\n��\0�\0\0w\0!1AQaq\"2�B����	#3R�br�\n$4�%�\Z&\'()*56789:CDEFGHIJSTUVWXYZcdefghijstuvwxyz��������������������������������������������������������������������������\0\0\0?\0�*�GS,u(���+��~����~�����\"��N#����.V�D^�k����@D]�G��V�tyt�D�ފ�c���T�*EJ�G�L������8�S�ꖯ�äY���uf��[�&�D�)�kϮ��\Z�[噒��0{q�}�f$�ƌ���h�9![*~��s,]7.TΧ�������)�>=��� Mnْ@�u�@~����\0?κ1�t�_Tr�ӱ_�����Ȏ����pE3�h��E���H#�U*A\\�%q�%�3�o�4��(E�7�O�������u�2]M!|2��=����<mNZ|��C.��S��NB�w$[0�d^_�)h��s֥kSeg.�,�}�Z�XeT¨$��Fr+ȥM)6{5�6�M\rJ��-0N�F@<0n?�ҽ�R��A�I5�+�b���8�1�~\'�yc�r��O�2�.�QVD~Ծ_�ks������E���Ԣ:�#(��1+�u��(��\rY�Ǒ��7g�\0����r�3�4[iG�ߘ7�c�5ˋIӿc�&�۹�wʱ�r�;�C�E��#�f�c�s�M���/b��w\nw&��+�^nڝ\'��K��R�w�D��y�ʐ��<���zR�O��K{x�L�B���:���AX�j�u%r/ڗeX��uW ���e���`�*�qҥԈ��\".�rzV���\\(�n�D[8�;űo�]�?�\n�Ӓ�w����`8�����Ʀ�N�#�o3 �������\\�傹��p��盵�2��ܒr�{\ZM9����N���9U�c���_�z[x62���UW��rq�S��|=ab�H �����}y���a�r�r:�<�5M���`�}U���pG\\�qO��1C�8�9��Z�:�2�����u����+�S���ʋ�5tl������r�H��1��Ƭ��\"9J�(���S�)�2�Nq���\0\"�*$d})���Wp���Ov�3^<�9���i��C�d��\'�!�y�S!$J�=9�i��ڨ��#�<5Rt�.����c���T��Yn.��a1Ϯ01�Z����kQ\r����>U@�Bz�>���\Z��\\[����>�ѳ�$�\0!B$*\n���_��Vl�b���������ZQ��\"�4֧=��� �m�7pG����_����y��J�$V4$\r�q��O#�k��\"�EE���5�Pӭ��-FH �J��W99$�v�An���J��G����g{�x�N�o�.�ͻ9����\\���3�b�>M].���A�y���Bg�>\\v��NCt��z~���Y��%�=M>I?{��:�i�ɖc�2�S�o6�t?��y��\\��fs.�lT�p���2��T��Nv��{�}GК&��=��\r>Q�\"��(��s�5e$\0��Zǵ����9�a��ɦ������C���8>�&����F#��^b��`�9<�\r��=�APO�#���T�FM��f`�$�\\g��d���bFiNW8�?��^�>��V�K�a�6�f,������ש;ƛ8 ��rO�j]��{c���@]�F�6<���Ǳ��W<�ߓ;��__����[�2)� �g$g��ى��v4Q\\T>�mS����NT��pO��2(��n\"2�j��Ϥ��Ċ\0!�?����:1�z����w�#\0���$�v�Z�.�.!v�x��A#ӊ(����k|��=����K+���\0���o�e�?��:�|��Q^��\0��G�K�����w�\"��&��QE�ɵ��F)���','FERNANDO','2013.2'),('898989','FIGUEREDO','12/12/1992','Usuário Comum','MTIzNDEyMzQ=','0a68d85','SISTEMAS DE INFORMAÇÃO','����\0JFIF\0\0\0\0\0\0��\0C\0		\n\r\Z\Z $.\' \",#(7),01444\'9=82<.342��\0C			\r\r2!!22222222222222222222222222222222222222222222222222��\0\0D\0m\"\0��\0\0\0\0\0\0\0\0\0\0\0	\n��\0�\0\0\0}\0!1AQa\"q2���#B��R��$3br�	\n\Z%&\'()*456789:CDEFGHIJSTUVWXYZcdefghijstuvwxyz���������������������������������������������������������������������������\0\0\0\0\0\0\0\0	\n��\0�\0\0w\0!1AQaq\"2�B����	#3R�br�\n$4�%�\Z&\'()*56789:CDEFGHIJSTUVWXYZcdefghijstuvwxyz��������������������������������������������������������������������������\0\0\0?\0�����#d�x*B�����sǽF�{S�|�br70��*Y,i�@8\r��Z���Ny(>�Rx�1��\\�?��\0^��=\n=\").uV���$8��9`�wq���#���A\\ʭUM]���(#\\���Z:s̶ӬH\0w�\ZM���8۞��L�k��R���k��ZrL7,�;�o��\'���\0CV\Z!�n,d������U\0>���g��pk)U����^.���le��-:��N�c��p�1VU��	\'k�I���I{t$���R|�\r��N*2�|��9�������L����}�\\����#w\\�\0s\\�͠�]��8]`e���IP�2	\'������k�\Z��I^����L�.ؙ$�U^2����r&�����2�g�ѐb0��zg�j��\r��p@�+�Xq��1�\\zs��w,6��V?�\\(8Q��v>�k�ϗC���GD4sgmt���ɳ��w�,�����(\'pf@#�=�� ��a���^���e���-��e_���!���;s��m㒓�:�_���#2�\nIf\\�� �=28�T�^Lxj��s}�F�Tl�֝�A�����m�x�=�~~�cP�气G3.6n��m�.�7!#��뎄u�DOʺth�M]�˳3Xr��ǧݪ\0V-�O𦓻�08�c`�|�<�?��LvE�[Cw{W�#$�A#?��\0��r�梡$�ʸE\0\0��w?C�3���)����v�H�/ 1a�+�\';�rMn�C\"�nnc���y��r�,6���N>���*�r�<�Snv��Mj(ͦ�<2�\r�˓p��(�fX/gtܹ�r1����En�`�W�K����o$2�N:���+�n����H����,���$)Q��eA�\0��t�^+�Eq~ɾ7���#�ۛ�1<��ნUbW2�ն3��\r:���甴}�[�c�T�pA݇J���{�]`hVW�	��@��n?^I��\r\\�[|C~-���\0v?Ր��R3ӀH#���a~��7�J�\\@(r�<��FGboNK�m��t��R�&��A�˸��Ҍs�A�8��޵��JD)�_(���5�~�&)\'����5�Z�ʂG�s��1\0��s����WW���5��A.G8�Nx��4Ӽu\Zw��q���\Z\'����&A#h\n�;������`���Q��|�P�0�����01�9���(&�}mr�����!��s�Y����S}6��6I\"[���ueb�l�J�l��pp7v9�����S**\n�R׊#�^]�O;��[�$�S��ѻ��^�������.�Bd2F�F�@,��d���|^�������E�̓q\n��.w\0A��p���E��m.��Qf����n�FO��S���Z˹xi8��=�mX�@�NH���]-�VM#+y��cR��v�\'�9�<q��K;h��%â���?1^rq��=�A.��m�P�lE �7C�s�d��z\n�r莊�oH�-���ۻY#�[v�>o3j���]��A�k\rQ&�(�ʨ�@W���9�F��1�1^F{��HC�N�A?�Jܴ�F��g�B�T�+��wo_�3(�S9AG^�����qo\"�N�����`\'\'��;��p���[y��9�E�H�*A����&癘��2\0Ğ�5I�;���R7�MB���x�ٮ�ߵ<�QIP�pr[q�ӂ��:f�M����B���B.x$��0�+���uO��$3�\'��T���b���#�s��pO,sGsn�)�Pq\r�*s��_��sRw\\����#-�=��-��/hk9�����	��1��o�kOXmR�sUWy\0`N0\'u���9��{]I,a����@�x��ל�G}q&�঄I��1��(\n�0@+�\0�>�\0�Et���]6�S��ԧ�.��f¢$�Þ�O5�|�ʵ�w��4�8ݵC�I%�*Frs�<g�\n���R��\0\0g���7Q�ݒ+��Ksˀ@ �2��n�FMm8i�:���W*���\n$r@�.����I:�r�^@\'�y㜋�����bh�&�i#��s�s��n�M; �x�eg��qT��y�+�\08�5���W@�e�c�2�M���^s��x4�}�:rJ*]�k�b[�hT��r	DH� ��#$�~c�s�U�ds,�!w��<��D{�l��]�qےFTu��?_Z����B��AG9U��Q�#,y�<c5�eu�ƜlV{�w�γ�DJ�H��mV����\0���Y���4�F�\\7�#|�s�;�\0瑌t��|-�$ImgbD��e�r�m]���{������jD�̟ �)1�L���#;Nq�����̝zmݳ�������H�T�]����m��;��On����K{Ŷ�M;��;��ROτ+��e��� za���m�\\�Ai䱍�v��d�6ep�e����p{)V�i\nx�$�S2�9nl�=Q�y�lL������\0��p*�+��4h�.̨Tm]ǹ�d�u�*;��[�*��o�:g����T<�6l��11\n&�Y� ��ϟO�b1؈S۹r�@�$�aJ�6gE;Fq����sM���]��,�I+r��,I?����MS_y�%��w8e;@Q�nc�;���$~M��DO<mY�NpH=˵]��[���8���8a�aIm�-�y����v�n�y�x�m=�	N�<��]��P�H*9�20þi�N�VѥY�>7ˆ�8re_����{d�.]\\[�&;he��f���r�@vFI����t�\r>�9ƣpc�L�l��[��s�:ry�m�&��H�dn�Pp�S�탎3��e�1C���c��2$x$rq׏ҳ]��-�ŕB��ģ;���P�]�@�K��:K�F98�Qۧ;�QEUv)��2��w�H��I$Q�>K�lq�9�;�{tbx���5V!��G^�QE`��̢�Y�KӺ�\r�\0;cnH�^�\0~Z��[vY�!��q����J(�[�G�+Z\\���P�	�ǿ�ɢF\"UQ���U��g�\ZE�@��Ą��B�9���\'��L(�<��1\"H�����w	n0~�QMu�ͻ�-bH|�+��?1��V|��.�wnF裙�A�fPs�8��Uu*=Fi�q���K�IV�돝�*��d��|*�C�P@��4QR�&%���','FIGUEREDO','2007.1');
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
) ENGINE=InnoDB AUTO_INCREMENT=23 DEFAULT CHARSET=utf8 COMMENT='armazena configuracoes da comunicacao serial';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `configuracao`
--

LOCK TABLES `configuracao` WRITE;
/*!40000 ALTER TABLE `configuracao` DISABLE KEYS */;
INSERT INTO `configuracao` VALUES (22,'COM4','9600','60kjebkk5wre1wv','d47j8v0tbuy53gy','l13VYmmWJF0AAAAAAAACFSREVPcHK4wgJMzrwA5I9RGatkLEYaPelxZSiT9FT-gQ',NULL);
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
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `controle_acesso`
--

LOCK TABLES `controle_acesso` WRITE;
/*!40000 ALTER TABLE `controle_acesso` DISABLE KEYS */;
INSERT INTO `controle_acesso` VALUES (3,'2013961211','0001','27/06/2017','14:58:24','14:58:59','DEYSE THAINA VIEIRA DOS SANTOS','DESLOGADO'),(4,'2013961211','0001','27/06/2017','17:40:57','20:52:10','DEYSE THAINA VIEIRA DOS SANTOS','DESLOGADO'),(5,'898989','0002','28/06/2017','00:55:07','01:01:00','FIGUEREDO','DESLOGADO'),(6,'2013961211','0005','28/06/2017','00:55:44','01:01:24','DEYSE THAINA VIEIRA DOS SANTOS','DESLOGADO'),(7,'2013961211','C.P.','28/06/2017','01:37:31','jLabel2','DEYSE THAINA VIEIRA DOS SANTOS','DESLOGADO'),(8,'2013961211','C.P.','28/06/2017','01:46:34','jLabel2','DEYSE THAINA VIEIRA DOS SANTOS','DESLOGADO'),(9,'898989','0001','28/06/2017','01:47:01','jLabel2','FIGUEREDO','DESLOGADO'),(10,'2013961211','0002','28/06/2017','04:33:27','04:39:31','DEYSE THAINA VIEIRA DOS SANTOS','DESLOGADO');
/*!40000 ALTER TABLE `controle_acesso` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-06-28  9:01:10
