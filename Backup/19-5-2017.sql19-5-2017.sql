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
  `nome_backup` varchar(150) NOT NULL,
  PRIMARY KEY (`cod_backup`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cad_backup`
--

LOCK TABLES `cad_backup` WRITE;
/*!40000 ALTER TABLE `cad_backup` DISABLE KEYS */;
INSERT INTO `cad_backup` VALUES (1,'7-5-2017.sql'),(2,'7-5-2017.sql');
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
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 COMMENT='nessa tabela será armazenado os horários de cada monitor';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cad_horario`
--

LOCK TABLES `cad_horario` WRITE;
/*!40000 ALTER TABLE `cad_horario` DISABLE KEYS */;
INSERT INTO `cad_horario` VALUES (1,'08:00:00','10:00:00','PABLO','PABLO','JHK','PABLO','JHK','PABLO'),(3,'10:00:00','12:00:00','PABLO','CIDRONIO','PABLO','PABLO','CIDRONIO','CIDRONIO'),(4,'12:00:00','14:20:00','JHK','JHK','JHK','JHK','JHK','JHK');
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
INSERT INTO `cad_maquina` VALUES ('01','HP','MINI TORRE',13241234,'WINDOWS 8','I3','500GB','4GB','500MB','21\"','Funcionado','L',''),('02','HP','MINI TORRE',12344321,'WINDOWS 8','I3','500GB','4GB','500MB','21\"','Funcionado','L',''),('03','HP','MINI TORRE',43214321,'WINDOWS 8','I3','500GB','4GB','500MB','21\'','Com Defeito','L','');
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
INSERT INTO `cad_usuario` VALUES ('1','W','12/12/2001','Usuário Comum','MTIz','0a68d85','S','����\0JFIF\0\0\0\0\0\0��\0C\0		\n\r\Z\Z $.\' \",#(7),01444\'9=82<.342��\0C			\r\r2!!22222222222222222222222222222222222222222222222222��\0\0u\0h\"\0��\0\0\0\0\0\0\0\0\0\0\0	\n��\0�\0\0\0}\0!1AQa\"q2���#B��R��$3br�	\n\Z%&\'()*456789:CDEFGHIJSTUVWXYZcdefghijstuvwxyz���������������������������������������������������������������������������\0\0\0\0\0\0\0\0	\n��\0�\0\0w\0!1AQaq\"2�B����	#3R�br�\n$4�%�\Z&\'()*56789:CDEFGHIJSTUVWXYZcdefghijstuvwxyz��������������������������������������������������������������������������\0\0\0?\0��CKHE\0dꐵ��RT�\r�kl�twR�dV9[�ֺ�-I��ڜ֖V�ݺG��Ȩ=�f �9 s@\r��W&p�+Ҽ��w�����������%��#x%�\"�@+���g\0�ns�Լ{�y��|6iqeeuڥi[X��B�\n9u*����s�-�\'��5���SΔ����=��a��5\\G$�c��eY��ͯDy���/U�]�	;���^ƾ��K��2��9Y7yk�Q��#��+�8�����oo6��	+��j�\n��I����8 pq�ɭY�` �&K��#�X��#�c�Uq��\\x<�bSI���_��ǽ���8�3��h�Nx�\r&�˺b\\�`�=��-�oC\rՎ�2���H�r\\ ؍!r�	����q����fYt��,B7��$j�we����grrN\0&����1�֣*U7ВQl�>�m#�\0*�����r�6\Z��Ԋ��A:��8�#�z�*�s&�vb�)�P ��(\0�O³�j�%�GHǮ��ā���[u���N���Bc$�Ȳݴ����;��)=��\n������LԴ:\"��*��3�>�!N��\0�5��xW]�u9��U��wCs(E.\nn�8ː��浼S�j6�4�X�K�]�凟0�b;�\0� g$���R1B�Ip������z����+AKF��X����+\ZV)|����2*�[��&�P6�C�xl�ڑ���6���ݴ�椰<�)0Sr�L�c�V �9ᶐ:����9����U�dL�d|�\0�O#z�*��n¤-�W0101�bI�NG��t/$�C��c*t�7�t�?���;H��b�K=��E)���i��2VB�0p��\0ǰ\'լ�\r-`��v��.�Y%��g	�dG�q�z׈�>$�ӵ	�6�[9Y�.�=�� (��`�W��%\"o\"`,|�� �3���<��+S�Ԓ��\ZO�l�ѡ7qr�͆X]��ʪ>s�I899��.��Dsmqw=���g���ĞG\0;���ʪ�*\"�U\0\0)j�R!ԓ�aEU�Q@5�dB����\n��E:�\0��\r�5XP���� ;v*�`2XA����u��27r��\0�H��nB9���G}k��Mt��U�|���{�x�����\0�7]YHT�u�m��;rǑ��܀O�%���~��:̞%�G�����0a��`�\0�	8\0פE�f�;[4д�a|�d,������OoL��b��C���bk{k����	er�q����\\����q�?���76�h�\0d�`u�U�p�b���N�6���7��5\r��5&���{�][�Y�A��\'�@�a�\0GS��f��\"EH�Q`*�\0*�mJ�\\Z�$�%I�pA�~�f�AEP ��(\0��\r�Ѻ�ԭ�2�c*m�Ǒ�\\pG�e{�q����\0�g��\'�\r\0iQYJo�\r�d�˹C�H#�8��ߚ|W^c�K�[<���r��Q��2U��CB�v9^I�B�?sj��i��s1rH�q��<?��+7����vXeV\r	U��{<�`c�ю��3WїĐ{�Y\r�܅m�n.��q���v�V\\~���7�*�Q$Q˷�b���I�����(��84֮�-���jzeƈ�~�.�Ռ�6ǒ\"F)#��9m�\0�X>	����x���k���I�M)2�A*�(A�lc$����G?�S[_I�p��Fk+n��9�##<e�A�)44�l�v�i�Ȥ�r�:#���Oj�QVO���Em#��A��Jo�K�EFi�u�>r\0	�X�	<���m��u����	Q�f�VB�,\0*�Eeʓ�\'\'�4ZCsf�\0a�X�2��4Cp^q��AH5L� ��]IVP �	��?����W����+y�-P�Ʊa7I����G�Nx�vǕ�X�u�j[�\0g�.U��5��G:�ʱ�Z�s&�d$���\0����c�\"�.5���ȣm`���)��%�22Kq��ޡG����\\�0n��EKv�~שK$h3-��o8�I]�rrO\0�ఒ��I�*���h����\0�\0\0���g��C\"9.Sc�\0�[s�;r��s���I\0��?�l%��2��1o�� � �BC�v�Yd�2�l��)�\0�l�����5tI-�p�}��p�	��8��\Z �+�x�-��*��H�2���AGzJ��g�h������S��ѿ篊?�֧]�����g�M�������+8�+F�\0��(�\0�Z�V��\0=|Q�\0~�:�v�ߝ?�oΏh��\0��r���o��������h������S��g�M�ѳ���������+8�m�y��%������먢��p\0�\'���e��%�dl�ڤ�2pd��\Z�`����M�6�����\'m��������q��<��`�.��r���\Z��*��%��,�`g�ݏ���rV������#Ef��E+�dP�M�3]�M\"����esʡb����$�U��El���:m������Ot�D%���S��r�\r�K��2r6�+l׈�����*�Q�6��\0�q���8���<QM)�\'q.ﶼO�@�\0#*I��p6���cie|�_���Gw�< ���ei�Ǯ�5(��Vy|�c��ݿ���z	1�v�z�Vl\"ڈ�+��X�\\Les���Y��<t�zj�(�EP\\�\r^_����vi�%��.�#v;�)�;X��\'����ծ!��\r�\\G��fO�)*���%B��\0�MF2V���ď<\ZT�i-���g>[B����1�0WQy�ϱϼ@#��v	�6���(�kТ�(*]I3�[!�F�4���b�Y�L;g?y��֢\"Ɗ��UF���-\\VH)��qF@�T��ҝE+��RI\n*N�]w[��>�#\ny6	�\rM�,I\"�\n�R��A�<Ө����(�UF\0�� p���\n��U���V�\0٘�\0��\'���a���H!�䑆?2���!���j��c�~UKfK!���L��8<�ab��dnW<�\0����S�\Z�YNg{X�9�و\n6�I<�}(�Ə�M�c����b��a���R�I>����8��	<7��3��bc̮8ʁѺ�O��V���\"�z��l�1NrMl�\0D�\0RV�ވ�?ٱ��͗�����Z0� �!�ٱ+��G�QEe\Z�rI���N�[HMo��U�6�=:�3�U�猌fC�ֹI,Wi���<��9,��s���Я�E�\Z�g(�I�oк����?������,k`�ggcJ�!�P�������g��>��/ڌ$	n6�8����E��M%�۹�aޝFi�&��jq��D�-Մ����A��яǎi-�OKcqv�1�\r��lRe�B�s��q�w�E�Y�\03���6؎o\r�\0\"�,y��\'�������$L�����b�0댜��=�pzg��N���y�)����\n� �V��\r�6nq������QIթ���a�G��','W','2'),('1232312321','PABLO','20/02/1988','Administrador','MTIz','4d2dc4a5','SI','����\0JFIF\0\0\0\0\0\0��\0C\0		\n\r\Z\Z $.\' \",#(7),01444\'9=82<.342��\0C			\r\r2!!22222222222222222222222222222222222222222222222222��\0\0m\0m\"\0��\0\0\0\0\0\0\0\0\0\0\0	\n��\0�\0\0\0}\0!1AQa\"q2���#B��R��$3br�	\n\Z%&\'()*456789:CDEFGHIJSTUVWXYZcdefghijstuvwxyz���������������������������������������������������������������������������\0\0\0\0\0\0\0\0	\n��\0�\0\0w\0!1AQaq\"2�B����	#3R�br�\n$4�%�\Z&\'()*56789:CDEFGHIJSTUVWXYZcdefghijstuvwxyz��������������������������������������������������������������������������\0\0\0?\0�<yh,�czDL�3	�f\'�,2͒NrŽ�v�����i����S��a[(���Č��_~��~\'���ͦI�eW����<2	�:d\Z�g���VX���3h����\'*��z�ksG�z��~ѪxZ0�ڤ0-�7	!$�g���BO\\����%U�퐬����T$��#(0s��Z��\Z%�uR\Z�A�GƸ\r&i�H6��E5免ͬ�S��Ux��܂z�T݈�v:�?�q*���}�j��ʧ9�z�%�9�xeEx�J:8�e#z�;W�i736�m\0�\"O�Yƽ������D5��۵�!K7�7��#���|�(��>`�޹��H�>���.�L��e�ΒY�\'01���܌�n:�W�C�k�T�^c�w���N�熓���\'���	ݗc��x��P���+����-�j�I���.z�{n��k�~*�У����Zc\\�w�wl�F\0�P��9��N1|5�Gsf$y�I-�X��\n۔�p��A�\'(�οkiw�<z��!V<���9\'����`�B���Ȕ���\'��H��ƃ�9(wIiu,h_nv�_��#�\\�*巇�\rn����I��-�a����w�=�LW�!�ѵ?�/\"����A�x���9l|�?{������\0�<Qie,��DB:�;�+3q���8F�BM�S�����Lt٧�$?4�[T�=8=q�\Z�@��Gr��4����EwW�C$�1TG���\0ɯ3��@%�.ehSk�eU���u��z�\nM]\Zs-���_���K[+�!O5� �D}A��Аz��.��f���b�y�?;A�(2{q?�Q��Ż0T��oH���r�R�&�(����#��p:��z��[��=n�ǚ7���\0��⻑��2\r�#� +np���bz�,5=*K�N��2Cx�ȢO��DP��A�<�{\n�g�k����%�R.��ʀ	 ��#��ڟoh�|�+/�z��{�Ϸv�=�֧�h�}��仗ʓk��v�\\c+��0=}�W��sI$��,|�v��A�s�sҼgBf�Y�W���#�`�#�s�~��\Z��ir��a$R�6>OQ�\'�H㑜~7m%f^�t�Y�9]̹�H8?�#�S�.����kH��������hح����<�23�\0`��p傌r2�A�ұn$��妝�y�\nǼ�:p3ӁWF���ؙJ�?im�l���L��rI,N\0���^+̮f���g�gy���rN��+�\'�m�,�[g�ŗ���p�&��7�|Ae\\��E��\0�(������5���%s�6�e?.r9�^����gg5��]�3������p8����7��\Zޯ\"��76�p��P�s���S�=���UH_CӼ�nm�E�SqL|�\\��\0g۞Ռ�����A�#���KkkX̗:�A�z����~+�u+I��F{[�,��S��=��5cu&��Ц�2��/88=�oƼ�^�+]bd�2zd����׿|LQGEb$��,1ʅ2Ia����6`��G\n7�rNy� ��5:�۲I4k(BT��r~��*��{j�����+1d0Ǡ����f�j�K��ڂ�$�����v�L���c��j����,�On�\n���\0/�v\'�\0��)\\)�e��R.d�h�Í�8�%A��[z�N�Sh׎��]�iR�����O\'�x펕���j�e=:D����Z5�G(�d���I������v��\rFm.���������/(�@b�\0A�8<W\'����tf��k�Y�$u��G �5��C�RTF�\0�01�c��;V�M�i�-ޣsu<ROv�0Vd����B�8��N��S#� �s�ޱ��[�X�E\n�_{)\'�r���\0��֖G�;w��d�])����T�G*��N�F;�y��uv	9�|�1��>���ڮ�H!����y	�=J�PUc*�$)��z�n��F7(�rt�����|���	��-����sJ��F����T�`|ݸ��/�n��VI�Xќ�pX�z�C�6W�����}{�Ҧ��Z��za#���0N�� c�����|ڍ��P��8`\"\'�q\\����m�\"�\'�Ns��PoY�g}��ޟ*尫	���©��v�B��@rOs׽ZXx{��D�Y�́���g;Nv��8#��m-D���Z�o��;@k\r��s��-�͢���#�Y���Gʁ�����a��&�DlvCN�BM$@G\Z<�n�|�`H���\0��h\'�5�-ῶ���O*����HI\\��2@�8�V�\0��I�Cj�<�G1�K�m���9��Q[X�j��\r����Es\'�v�Ks!dv��d{0_\\��z�8+].��Oc(��Y\"a��@APFFA��$��xܒ�1�Cm�<}}��d�昲�vZ�3���I�m���\'�n��\\�������򼤄T�q���&�Z�s�uvҸ��*?$���һ-:7t¯σ��=���r��+x&��DY)\n3�8\'�@�:�����oj�xw��۝���u��i&KZ���KT�fv��c��<{�\rTY�Y�lAX�R�<�Ni[]���*�\nG!F=��N~�y/Ն2q��Z�b�<���m]Y�]\"��lz�4�nHK�yy9�����\020{f��L��\ZY§q��-3a\0\0�{���C������c̑ce�\0�\'wJ�m�Z(��sI�I�Tȑ��,O�]���r0q����/�\Z׊a{�٤9L�U�}�h�vx\0�$�c�b�v�r��>T$���S���x�=��tV��\Z���P\"\"���@\0\08\0p+H�V���T��G���˿!�A�D\\�x�P$f`I��B�urd�0I\"4\\N``]T�P;[hf\n�!ŝ9����RGm4l!���G0ɏk.Nx�̀�=\0$ %�B��SQ3[��\"������2K.1��n�k��)i�5����P��A �/\"�9.��;T���I��riܵ�YE!�1F%��Y�,��r�z6�mnJ�@2�k������!!.&��p��of��|�T��\n�Z6���euw#YE5�X<�r�Fȶ��\09;�cjMkqܻ�M��4�ݡ��B��E��T#�F�9l��$���5�XY�OQ���;!�ȓ�/�%�����N\0w���5阙Y�x����9Q���|�O�5{{�D�����w����\'�12=��vF.;�n�ڴog�\';�ʻ�9���q����/�	!gR\n�\09�3�}*�lf��jGN*����ܫayy��F��v:�����5�A�@�TY=�ӎ�Ҩ%�0�UPX5Ac�Hb2�(�@\0	�����ΰ�n�r�(_�5��a���>�	�0#���w`gk���9��˘yn�&��H�\rf�VAs&�s)Cp��F\\.�?�W�(S]j\0z��oOk�S{v0o#;���np¹�J��ʟ��FÌ�s{{g�����0�ûo�3�\\��d��?�����is�<R�������W�\n�S���Ya�����XNɠ�Y�HW&6��\\q�9.߼)��v�z�^It|��)a�g��^2c���rA$:�&M6��]Y�o�^Eu(}��1�2�G99郷��RC�q�-���Ў�B���|�.�����\\n[�8��qh���,Zc|r�ѵ�4�=���\"y`)��+G��j%��\r�rC��p��PK|�4��\"@K���>`Kpvv�j�kӭ���Ffk�t�|�\\�<\n�	�x \r���ha���Y~а�������+@������9z�SQ�i-��y%���n�\n����\'ns�d1�r9�+{��7���/��0F��@\0�S�	����vڌ�m��:�%Ա�\r�ٱ�� �i����X�Y3Zj���w$�c���f�rЙp@eee%X�(�P2T򖛅�!����͆D��w�$�u?�2���3�p��.��R{�I�3H��=�G�i����]wC4d�*GPAʜ^��Ir��גJ�zw������y��e�΁u�X�>�2� �#e^G��}�M{�L΋=̪�����3���}z��\Z�;6;ln����.S�r���lƻ��\0A�֐���%��,�^$�t��A\"�7�I�-�kr^������%������Oj���<J�K�\ržuU��ylg�#�GC�d��kXL�qo�g�]���{�ֵ�7qID�>$�jW:t�Kr�� 2��FӜ���:�]���m<5g��Af��D�K4�#30$�\n{}ޕ�M\r�[�4����\\�A\nH�+o����m,W��Vp��\n��ϑ�@��q�?�m�r�X�^{�)��\\ڹa�@eP�cp$��r1��T��k;0{Hn�e��]P`|ў��\0Z�y䵖-:�-�y\"Ǚ�9V,1���8퓒��u��$���\n�Lo� ����	�x$w�|�j���s��N��c7b7��a����;����=�X�;�K�+�D�h���c.1���q�\'9�jZA��\r�a?�ř7F�m�ĞÝ��\\���mIaF��Wr�%��W\n8]� �Q*QcU\Z:k36�nt�]ch%��[��!�]C���I��I�5�/b�c�u{�\06�%���P6��\"}���+�Ts� �_x��M����ɼ�S9�c�QSn�I��\n��V\rr���<�U�v����q��Y�6-N����ede��\0J�t��/\"s+.O\0($�1��3�F��:}�۴�(CĉЌ��U��Mh��i�hm���N\0#���;c�OsZ��Wz}�D-ԡ��;\Zp~V\\���7rq�0p�\'B�R9�4Y�+P��+���=�j�u_	k�\\�V1��K�p�O�0>��z<�L�j0Q�eE�\\�PV3�00<���5�	��X�!\0s�j��[�r���]�ZΚ洹�`q�O,�V\'\0�����ՠYuK�\"�����<(99\0tŜ\Z��ns�T��m^�4��H�Q���=F[=���T����\'c���W��M>��DU&�r�;��,	q+�?{xۻ ����HŹKuh�d�F�s��\0�A�������^�c���9y�OV\'���M�|m��\\ɧܛi.�@o0�pN����kuc&�?��','PABLO','2015'),('2013953416','CIDRONIO','14/11/1989','Administrador','MTIz','42d21664','SI','����\0JFIF\0\0\0\0\0\0��\0C\0		\n\r\Z\Z $.\' \",#(7),01444\'9=82<.342��\0C			\r\r2!!22222222222222222222222222222222222222222222222222��\0\0u\0h\"\0��\0\0\0\0\0\0\0\0\0\0\0	\n��\0�\0\0\0}\0!1AQa\"q2���#B��R��$3br�	\n\Z%&\'()*456789:CDEFGHIJSTUVWXYZcdefghijstuvwxyz���������������������������������������������������������������������������\0\0\0\0\0\0\0\0	\n��\0�\0\0w\0!1AQaq\"2�B����	#3R�br�\n$4�%�\Z&\'()*56789:CDEFGHIJSTUVWXYZcdefghijstuvwxyz��������������������������������������������������������������������������\0\0\0?\0��CKHE\0dꐵ��RT�\r�kl�twR�dV9[�ֺ�-I��ڜ֖V�ݺG��Ȩ=�f �9 s@\r��W&p�+Ҽ��w�����������%��#x%�\"�@+���g\0�ns�Լ{�y��|6iqeeuڥi[X��B�\n9u*����s�-�\'��5���SΔ����=��a��5\\G$�c��eY��ͯDy���/U�]�	;���^ƾ��K��2��9Y7yk�Q��#��+�8�����oo6��	+��j�\n��I����8 pq�ɭY�` �&K��#�X��#�c�Uq��\\x<�bSI���_��ǽ���8�3��h�Nx�\r&�˺b\\�`�=��-�oC\rՎ�2���H�r\\ ؍!r�	����q����fYt��,B7��$j�we����grrN\0&����1�֣*U7ВQl�>�m#�\0*�����r�6\Z��Ԋ��A:��8�#�z�*�s&�vb�)�P ��(\0�O³�j�%�GHǮ��ā���[u���N���Bc$�Ȳݴ����;��)=��\n������LԴ:\"��*��3�>�!N��\0�5��xW]�u9��U��wCs(E.\nn�8ː��浼S�j6�4�X�K�]�凟0�b;�\0� g$���R1B�Ip������z����+AKF��X����+\ZV)|����2*�[��&�P6�C�xl�ڑ���6���ݴ�椰<�)0Sr�L�c�V �9ᶐ:����9����U�dL�d|�\0�O#z�*��n¤-�W0101�bI�NG��t/$�C��c*t�7�t�?���;H��b�K=��E)���i��2VB�0p��\0ǰ\'լ�\r-`��v��.�Y%��g	�dG�q�z׈�>$�ӵ	�6�[9Y�.�=�� (��`�W��%\"o\"`,|�� �3���<��+S�Ԓ��\ZO�l�ѡ7qr�͆X]��ʪ>s�I899��.��Dsmqw=���g���ĞG\0;���ʪ�*\"�U\0\0)j�R!ԓ�aEU�Q@5�dB����\n��E:�\0��\r�5XP���� ;v*�`2XA����u��27r��\0�H��nB9���G}k��Mt��U�|���{�x�����\0�7]YHT�u�m��;rǑ��܀O�%���~��:̞%�G�����0a��`�\0�	8\0פE�f�;[4д�a|�d,������OoL��b��C���bk{k����	er�q����\\����q�?���76�h�\0d�`u�U�p�b���N�6���7��5\r��5&���{�][�Y�A��\'�@�a�\0GS��f��\"EH�Q`*�\0*�mJ�\\Z�$�%I�pA�~�f�AEP ��(\0��\r�Ѻ�ԭ�2�c*m�Ǒ�\\pG�e{�q����\0�g��\'�\r\0iQYJo�\r�d�˹C�H#�8��ߚ|W^c�K�[<���r��Q��2U��CB�v9^I�B�?sj��i��s1rH�q��<?��+7����vXeV\r	U��{<�`c�ю��/Y���[i�5kFf���@���,�p@ϠȬ��1��o�T7n�H��o��F�������JQw�pi�]�[A�B��ˍ��8]۫bm�$D�RG#r۸�|��sB�=���g��\"�̚&Re �U0P��2��I�w�|<���� �;��1�.�Vݍ�s�FFx���ZRhi�\'��|��	�I��)ltG=?���:���_����G���=֔�ڗ������|�\0j��y�=@�Ӵ��E�>�b��RX\0U\0�˕\'�NO~h�������feǘ\"h���wN��j�vA�-$����.A\0��M18��\0���V<�^Z�{�b�$n�-���ԏΜ���+T��Է��)�\\���kQX�u��c\Z���M�~�I��\0Yӑ��^E\\j)����\0�F����Sy�K�Hdd��*��B���p�x`�i�F���~שK$h3-��8�I]�rrO\0��lM�\\��R�\Z�bA�q+��H�x�53giۂ��=+_i���9��K4U��5q�a��r�m�僝��F}�Đ��\"�6��th�x��rrr����kgu�����?�F�����4��l�_Y�����:��?����kO����\0�cq�\0�+gu�����?�F�����4��dc�-i�\0?���n?����Z���\0���9[;��\0�?���\0\n7]�\0�8��sK�Y���Z���\0���9G�\"֟����\0����\0�V������������\0���F0���S�\0����\0����C2��~Y 6�;��0~��E7;��.yÜ�\0*�eͣ��,a��l|������wm-��\'9\0S��Ö��H�w�U��),�e?.����㒵o��s�\0\\��\Z*��j�X���T�ٓ�܍&@o.2I$��~`������5��i���a�k�c��,%�\r��t9�B��5�c�;7����v㸧�e{���\ZQEIAEPEPEP\\�\r^_����vi�%��.�#v;�)�;X��\'����ծ!��\r�\\G��fO�)*���%B��\0�MF2V���ď<\ZT�i-���g>[B����1�0WQy�ϱϼ@#��v	�6���(�kТ�(\0��(\0��(\0��(\0��(\0�w�W_��[�\0fb��(�7�a�R	 �ےF��:*����]��e�q�U-�,�F�m2�h������\\�8#�r;QN�k�e9��b�D�Gf (�y$�����\Z<RM7E�S���1�έ��CeJ�$����㓎u%�k���%Sq$!K�0���f�ǦIEi9�F-7���Ѥb����\0�\rhB6o����[I����\'�ރ�U4Ϳ2�>|��@<��Q���(��RnI9?����a&�ɕo4=�M2�\0e�Y%�IYe��\'�����?��I���ob\nO)���i����9�֊+%Z�m9?��4����Yb�����射�� ��Ï����5���O�\r��s�e�c���U���WMY�=��0��]=Ε��kih�����̤�eh��H�\'�j��\Z$q�9�co���@�Q�QH\'��oӵV^����NH��jjРҬnc���_w�_i�5e\'�t�3��#��$pî2s�����\n):�?��摧�.���\"?�}�7�\Z����&�\0�v�EP���g��i�����','CIDRONIO','31231'),('2013961688','FERNANDO VIEIRA SILVA','01/01/1991','Administrador','MTIzNA==','ab381b2b','SISTEMAS DE INFORMAÇÃO','����\0JFIF\0\0\0\0\0\0��\0C\0		\n\r\Z\Z $.\' \",#(7),01444\'9=82<.342��\0C			\r\r2!!22222222222222222222222222222222222222222222222222��\0\0t\0N\"\0��\0\0\0\0\0\0\0\0\0\0\0	\n��\0�\0\0\0}\0!1AQa\"q2���#B��R��$3br�	\n\Z%&\'()*456789:CDEFGHIJSTUVWXYZcdefghijstuvwxyz���������������������������������������������������������������������������\0\0\0\0\0\0\0\0	\n��\0�\0\0w\0!1AQaq\"2�B����	#3R�br�\n$4�%�\Z&\'()*56789:CDEFGHIJSTUVWXYZcdefghijstuvwxyz��������������������������������������������������������������������������\0\0\0?\0�,R❊1H����ڍ���{mi���`�@I���LVB���, ��}n�ֶF ���EI�i�*B)�Pأ���1<[�7��-}��\"i Q�B��F}�¾rkOx��kۉ&���wH{uڽ��t�k���>ӭa2~�Q�YP��ls�����������DJ�d��?�zƥG�F������j�u��[v�7���_��]��?]��E�{�Z:9��|��,W>��y�+��.l\"���.m�-�,�?�y��i~ �u�]f���&�m���)B�n�*���}�i��#��\"�9HȦ�RM\"�%�-%(�_���}�X��e���x���/^}�{g�����҈A���3ڽ���_��l\\������\0U�{2m������&Hw��rA9>�k�����3�\n��n����j\Z�2L鴂9���Ӯ�h�����fY�0�-�Փ<� �S�1\n�c��$n�\0I��=+OJd��`�}���d���\\��3iE��x�zM� \r�_��I��t�UED�T`\00\0��rVV<�>f��)�S�0��J)��7����lno�ീ&�\"��&����s[��k���&2G�N�#\r��I�{]�פY���ZK����ra�q��=Fּ�x�S���k���b�#x��9\'b��ߩ$�SR.Qi\ZR�$�=x��%b��68U$���\\���Y|m��6�#*9A)��\0ǩ�ߋ�#OYmww3(1\'N=[�ǡ�<z��w:���_J������1���NNW����Օ���}3����.Ȋ+��K�x�>[v#<�8��FN\rt��MӵmCB�[�.�Kk���uta����z����$\Z�^(*\r�$G ;�\\mc�`\r�=�]v8Om4Ƭ�>���a~�iu\r�yT������s�����Ԁ�<s���Dt!uI5���@��\0���u c���_<j����ޛ�N�[���g<(�p\0�O�kо3j^v����a[h<�T�H� ���3��&�@�yF1��q�:�%�����R�##�8�zU����w�G�\0^��:�(�;&�g^i٠ڙr[p98c���Uj��\n�եY.Qp	�r~���9�uϥtcZu�b)iW!�@>��,��|ԋʳ�x�8�\0�=�x�\r�L⾉�o�\\��[�yn-�kv��L�\0�x������|��j��{/���}#S�?r)�P}�H?�\0��pw\'�]D���#=ǖ�?��d����kA�\0	e�ǀ�bB��{�\0@+�\r�v�`c\n�$`��5sK�Cr���Y1��*��ۻ\'#�4eB��q�֍OgQO��2�i�2H�s�sɨ�q��Q4��j����\0�H�#�k6�we$����L���UQ���(fڟ*������q�\'�}(]�� ���{�\0��^��U�����J�5`� S��\0W��$.�����R��W��s�����i�6�lk����A���~&s��H�\0�/���DL[��C}?օ�<�;�(���y#\'��eF梍�i\n��ʃ�y}z\n\0���\0P\0��SI�5͌\"����{f�2/�d��U\ZH�$�{f�\Z$�	$�����rH��{W��������\0jW����[���W�4N�d�XF��r��[oj,���L$4��b6�g����<�/-��{ja����6J����3���v�s�\0�)-�YfY�����~��]�-�8����W�0��sys#[��5��yjTG����/#�m\0`g%��m��Vf��n6�i2]�r��\'#n3�m�b������E^폖���#j��c��}P�Gi����{_��|7y(;]�\'�R?�#E=���','FERNANDO','2013'),('33333','USER','01/01/1999','Usuário Comum','MTIzNA==','93581b2b','LETRAS','����\0JFIF\0\0\0\0\0\0��\0C\0		\n\r\Z\Z $.\' \",#(7),01444\'9=82<.342��\0C			\r\r2!!22222222222222222222222222222222222222222222222222��\0\0s\0A\"\0��\0\0\0\0\0\0\0\0\0\0\0	\n��\0�\0\0\0}\0!1AQa\"q2���#B��R��$3br�	\n\Z%&\'()*456789:CDEFGHIJSTUVWXYZcdefghijstuvwxyz���������������������������������������������������������������������������\0\0\0\0\0\0\0\0	\n��\0�\0\0w\0!1AQaq\"2�B����	#3R�br�\n$4�%�\Z&\'()*56789:CDEFGHIJSTUVWXYZcdefghijstuvwxyz��������������������������������������������������������������������������\0\0\0?\0�5*Qң)����Lݞ���\0�P��TN�^AP2�V�U>��v{QNϹ����8�V�5I4�\rL�N�\\J�(�G#<�=�����r�	��Cow����S�Q�\0/����ʑQ��9?k�~(S��K�m�;��3��W���w��%߈�|̾B�^	�Ny�\0�׭,���;�U$�2������2�a���W+�FrG����ӵ[mZ�\\ږ۝��9S���;� �1`�ƌ���۷?�5��	\"ўᘘ�o�\'9ېO_^?\n/���(�[����z�����\0:)���QL���Ƣ��I�\Z9�f$�¼C�^0�|F�of;��N:��׮z��_���\0��=n��\0@z�95���Ӵ�om/b���H��$A�Q�U�l�W0Z��4`��6��ԁ�����;q�j�9��r��?\n�yl��fS%��Q��c���^A*���a�ɫ��o�\Z��׷����(\n�<\0A��\0��J�F��;���H���F?��bK�K��F3RZ4:��v�\nu4���V{3�<�;�{@3^8{��h݀\0����Ӯ?\n�����M�,��;�ca���b� ɚ�Z04|���QY����U�Ƒcm���c&�M���������L��\r��L���6?\r��+�>*�1�@�?}�\0�W�t���Y����+[K�u�\\��SK����U?Fl�\0֬�;�zWm�=N��_��˱��\ZT������t?EF��\'m�B��{��Wݳ��\Zx��9\rR�a�}�j��ge����yY�|�0\n���\0�+�/�^}��W�4��2G��o6<�����?�*��=k	n�0z�U��@�-%֬��0On���A\r�vc���v�\0e��\r��8�9�z�A��ıx�R�*�̀(��ҝ96S����pJ�ddu?�v^��kmH�㸏��3��A��܀G�Y#�[8�X���N�C�������U�n���vۙ�B��y��OJ�?t��������6��a����I��!de7)#�����?\n��]���Q\0m��ߜc�\0��oUӿ��5%���H���2�|�\0����\Z_d�_]�naYZ �䌱\n �d��J��^n�7b���pcV������v�����P��8�����G���\0z������Z�W�G�T�0,��8�񹉼_�Jlܠ��7]ߎs�z�Q$�I��09Q�Exg�dx�Se`��I��\0x�S���;o�$��q�\0��g����ӕ�RU�����5��I<Y*.���\Z�c�q�=�G��M\Z���->	��H�W^����_\n��_��zխ�Ƣ9��X)�?�-;P��_�:[\"��\\�s�7�3�����6�t{+�[|S�<a���\0�\n����:|;���4��F2�b1��99��I���������x�b\n�!x�����>�\0w�z��v����u�K쐱H�Jt`�A5�N�\Z�n\0���\Z\r�T^{ϴ���\0�X�r�����dO����� #������(���y̗�/yFe�K��������&It�w�g�F�B��r\no�>�⽡�#v3�W���2��<��VR�G�Z��V�M\"�`�( �s�N?LR�M F7���\Z���;)�ey���U�}��>{�n#d���*2I��m������q\04�F�z��6BJ�}�G6�q��*���f�ccpĢ�\0��q�v�i��8#�8�4L�(ˏ�k���&�]D]��f�����+��\'�����`�1\'$�Q7t�#o���}�tQP;~#��Ѯ�S�$�W\r����n�Yp����+E�u:�?y�\nױ?���̡�<�����d`$QE\0C�]��Ձ�$��f�(��Q@���','USER','2000'),('SAD','JHK','12/12/2012','Administrador','MTIz','123','SI','����\0JFIF\0\0\0\0\0\0��\0C\0		\n\r\Z\Z $.\' \",#(7),01444\'9=82<.342��\0C			\r\r2!!22222222222222222222222222222222222222222222222222��\0\0H\0m\"\0��\0\0\0\0\0\0\0\0\0\0\0	\n��\0�\0\0\0}\0!1AQa\"q2���#B��R��$3br�	\n\Z%&\'()*456789:CDEFGHIJSTUVWXYZcdefghijstuvwxyz���������������������������������������������������������������������������\0\0\0\0\0\0\0\0	\n��\0�\0\0w\0!1AQaq\"2�B����	#3R�br�\n$4�%�\Z&\'()*56789:CDEFGHIJSTUVWXYZcdefghijstuvwxyz��������������������������������������������������������������������������\0\0\0?\0�5�N�-�p3�E���g9��b� �k��@���8��RG�����	e���,�}��*&�I�@B�@�v���ҩ��8�b;���gԚZ4q�Ƙ%��z!��h�YP��\0� ��U�3��m�\"��O֠|F{t��f�\rF6N�*�ۯ��2\"�����Q<�ؤv�G�T��0K��C�U�`���ޯ�D�/������b0���J݈�FGҘi*����p������N�j�U�|r��$�i�|�o�yHa�\03S��]Π��l�ǂ�*	#oo�΍!�c�1�\0��ε�3�[�K#E7́,R���?�q��G�8�{h5k�V(l���y���:\r5����_g�W�ʂOC؞ն�Αwz��4٤bd;w�u�Hn��\0\Z���w��lK���^�&T­\Zg���C�w�P��ZK�����xee�JA?�!T����Y�$�������I����(��ڻ\\r##�Ns\\ֽ��x�U���c��#�aQG@3��$ֶ�␶���+�$3�/����1��\'���4��\'��1�uѴkrn_g�0H*rKd�c�zb����&��BA#� �ֵ�	1�\0i}�$;cQp:��R��0���I�\\z�^�wo�.1�ՙ��=ѶI�2{V��4�	�N�\Z6l�F���g+[-��N{��rd�B�˗q�o�VbG�oӔ8<z�?��JjV`�?��=�{s�f�=i̟�;q���\0��,��R9���߭Fx�L	$?�(#,���ƀ8��LV�\"^p���\0�T�\0RsN=)�\0�ޗ�i�K@���\ZX�Z�n�1�C9�*�����J���4j�v2����2Nrs�����ی�=�͝��%�-*�(����C�\nC�ku4��Mn	�\0*\0	����U/QQħf{T���,\"��)�!���#��9��3�1�G�M=(l�y��J#ʙ2Ǯ0BcӷcҮ��pWrNI�N.��g\0�����f���#�~h�\0>_,�|��;nl����S(�����N�;Rv��*�\0��?��\0���?=�FjIs�1�hVoo�\0F�\r�I�f��P����RE\r7%H`pA�(7�����p;\0(����JZ(���f%T8��Ҋ(�ABz�#���\0�P��','CI','123');
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
  PRIMARY KEY (`cod_config`)
) ENGINE=InnoDB AUTO_INCREMENT=47 DEFAULT CHARSET=utf8 COMMENT='armazena configuracoes da comunicacao serial';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `configuracao`
--

LOCK TABLES `configuracao` WRITE;
/*!40000 ALTER TABLE `configuracao` DISABLE KEYS */;
INSERT INTO `configuracao` VALUES (46,'COM4','9600');
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
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `controle_acesso`
--

LOCK TABLES `controle_acesso` WRITE;
/*!40000 ALTER TABLE `controle_acesso` DISABLE KEYS */;
INSERT INTO `controle_acesso` VALUES (1,'1','C.P.','09/05/2017','23:48:36','23:49:29','W','DESLOGADO'),(2,'1','','09/05/2017','23:50:43','23:52:22','W','DESLOGADO'),(4,'1','C.P.','10/05/2017','09:08:38','09:27:03','W','DESLOGADO'),(11,'1','C.P.','16/05/2017','23:47:32','23:48:16','W','DESLOGADO'),(16,'1','C.P.','24/05/2017','08:51:36','08:52:17','W','DESLOGADO');
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

-- Dump completed on 2017-06-19 11:58:49
