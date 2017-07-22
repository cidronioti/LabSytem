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
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8 COMMENT='nessa tabela serÃ¡ armazenado os parametros de configuracao do sistema';
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
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8 COMMENT='nessa tabela serÃ¡ armazenado os horÃ¡rios de cada monitor';
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
INSERT INTO `cad_maquina` VALUES ('0001','HP','MINI TORRE',363523,'WINDOWS 8 / LINUX','INTEL I5','500GB','4GB','1GB','19\"','Funcionado','O',''),('0002','HP','MINI TORRE',162092,'WINDOWS 8 / LINUX','AMD CORE 2 DUO','500GB','4GB','500MB','17\"','Funcionado','L',''),('0003','HP','MINI TORRE',168273,'WINDOWS 8 / LINUX','INTEL I5','500GB','4GB','1GB','19\'','Funcionado','L',''),('0004','HP','MINI TORRE',905863,'WINDOWS 8 / LINUX','INTEL I5','500GB','4GB','1GB','19\"','Funcionado','L',''),('0005','HP','MINI TORRE',387463,'WINDOWS 8 / LINUX','INTEL I5','500GB','4GB','1GB','19\"','Funcionado','L',''),('0006','HP','MINI TORRE',938474,'WINDOWS 8 / LINUX','INTEL I5','500GB','4GB','1GB','19\"','Funcionado','L',''),('0007','HP','MINI TORRE',484746,'WINDOWS 8 / LINUX','AMD VISION PRO','500GB','4GB','1GB','19\"','Funcionado','L',''),('0008','HP ','MINI TORRE',864723,'WINDOWS 8 / LINUX','AMD VISION PRO','500GB','4GB','1GB','19\"','Funcionado','L',''),('0009','HP ','MINI TORRE',384732,'WINDOWS 8 / LINUX','AMD VISION PRO','500GB','4GB','1GB','19\"','Com Defeito','L',''),('0010','HP','MINI TORRE',583832,'WINDOWS 8 / LINUX','AMD VISION PRO','500GB','4GB','1GB','19\"','ManutenÃ§Ã£o','L',''),('12','EQWE','J',7,'W','J','S','M','M','M','ManutenÃ§Ã£o','L','D'),('QWE','QWEWQE','QWEWQ',123,'QWE','QWE','QWE','QWE','QWE','QWE','Com Defeito','L','QWE');
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
INSERT INTO `cad_usuario` VALUES ('1212','1212','11/11/1992','UsuÃ¡rio Comum','MTIzNA==','1212','1212','ÿØÿà\0JFIF\0\0\0\0\0\0ÿÛ\0C\0		\n\r\Z\Z $.\' \",#(7),01444\'9=82<.342ÿÛ\0C			\r\r2!!22222222222222222222222222222222222222222222222222ÿÀ\0\0i\0m\"\0ÿÄ\0\0\0\0\0\0\0\0\0\0\0	\nÿÄ\0µ\0\0\0}\0!1AQa\"q2‘¡#B±ÁRÑğ$3br‚	\n\Z%&\'()*456789:CDEFGHIJSTUVWXYZcdefghijstuvwxyzƒ„…†‡ˆ‰Š’“”•–—˜™š¢£¤¥¦§¨©ª²³´µ¶·¸¹ºÂÃÄÅÆÇÈÉÊÒÓÔÕÖ×ØÙÚáâãäåæçèéêñòóôõö÷øùúÿÄ\0\0\0\0\0\0\0\0	\nÿÄ\0µ\0\0w\0!1AQaq\"2B‘¡±Á	#3RğbrÑ\n$4á%ñ\Z&\'()*56789:CDEFGHIJSTUVWXYZcdefghijstuvwxyz‚ƒ„…†‡ˆ‰Š’“”•–—˜™š¢£¤¥¦§¨©ª²³´µ¶·¸¹ºÂÃÄÅÆÇÈÉÊÒÓÔÕÖ×ØÙÚâãäåæçèéêòóôõö÷øùúÿÚ\0\0\0?\0ÌmfÒ	­’VÚÓ®x#äà›:Ö…ı–¡‘o:HGU=pyÅp‡N¸È‰Dm6ä¸ñÛ}1×½+i—1:x·nÀf\0q×Ôçòô®¶¤´ŸS¹±Öã[›Oû;¯—ò‡ã’\'¿N8®Š8‡W—¥¶§Ò¼P®ùxÜ¬@OÃï~Y­;]c_Áv·Aø\\±Îr:íÁ#¡9õıqje:tßÂÍNğAn±»+²¹ÊàŞµ[áîªæ¹5ÙÙ7$Q	Y˜óœNéYWö³\"ıoRnvnrøİĞ·sŒc¡à“×­§Ì#²û-¢N±³yÜ«6æÃÑŞÿ\0¾½¹v¼lËJ<¼·=–0’Æ²#G”ƒÁ¥sş+ñ¾Ù`´Ëq»˜€»vöï×ÔV¿o4ùà±–ÚnŠ\"•XÇ<ıá‚õ³5ïE®jšwï#X£`vî&â3“Øwô¬Ô\Zz’©$õ=\"ÑÚîÊ+‡‡Ê2.í›·`vç©ŞjVöwC2¸Ù˜°Æ1»n9ÎqíÍr²øÚêiá{bÛ;A,İ0ÙÜAã=_Ê¹y5«Û¡w,óù²ËÀ™ì€«qï•ıOzjœ’Ô•M7©ëIåÍKÀeaÑèi\\W-uâäÒ^×LµÜy0ªwœ9Q‚§İ=~£Ü¶ñ³W–îÍ~\\`ÂÄäcæõÆ0O\'¸½íÉtÑ¼Gœd×Kà9¢—ûGÉš9v2#ìpv°İqĞ×xÃ]‹Z±´ØHdi\Z	r0®O8à·~™í>Ü1¶ñ›*ªC4.ö,ôùëVÓå¸ÕjqhŸº\0{*ÄPpA¸8Ërjº´´«°8şÇõ«QÜ!eÃH1êõ®¦Î.bå´Å_»»9íšÔ¶€’Û™r_QY±K?=·\"h&Ş\n0éÉdşU”™.H¼¨ä°<Õ˜mâ•r\"\'î°ëøT!•:È£88^~µv™.¤û)Á“l•%r(ôM1H+¦Úr P•iös&\rº\08>\\¨éÔşu|`\0ª¬2=8Ğ¡±ø$òr?§)³Ncü7§Ìb‘Ìƒi\\HàÅ|~•JhÓab‘;ˆcƒ é×Ï­t›«\r»ˆäÜTâÔı”Ê¿>ã‚6|ÀwõsØÒ2“êp2x#Ly·ïH`@Pê£““÷T\Z”øVa)mwy,$\0gv9Çùï]làÙÉ€Œì;Çæ\r5§‹ïÉÇuEÆ=;ÓæcU\'Üó›ŸÍ-Ã¼º«»Üs:õïÇÌ×¦|!ĞÎ‰ı²VàËçy9ÊŒyŸZ®ö–Ám€œå2p}8WSà‹Qn/±p’n1ñ\Z‘ŒnêOZ%$Õ!RMÙ³ÅÕğóãp8«qÛf<¤ìGû¹şUN2&\0ÀÅ\\Ye+µ¤vR0rMt6Î)2ı½¡DËÊ8öçõ­D\\ìb£Øÿ\0õÖd¥ş`êqÍmÙY[Ê0¦FcŒ\r‡©÷ü+935yh‰!„d`z2çW#FEËŸã ”¿ÙËÆ‰’ç‚Àã=+?[ÔâĞt×¹œ1Ÿ.(÷´„déĞœúÂ²æ¹q¥7.TµUñ&“¤ß[ZOÏspâ8¢2I?ˆp:çæcš³¦İÇçˆÛ¿…¶€AÏ\'ä¥yºXÏs,w’;O™Ô9c‚¸ĞØkÉ§­ÄrùÏæ90Â¸ÆO¿Ó¥rJ¬¯xê{ßÙÔıŸ-µgk¶épÅw şöô«V’¼AXZa7dŒ‘Ôwç××ñ¬‹jh¡&1Ôg$‘•Ï]­ßèOâ_†ãí6)uƒc©ÈnêsÈ`x ÷ã­\\jÆzp³¡«ØuÕ¾XHÏ¸n\nåœş•ˆ—–³\\I7¨ÓF@h–D-ÿ\0|õí\\Äïİ¥Ô\ZB»\"ù~låËH^0N;îÕÄhº|š¾¤VÕI•¼NÕ\0åÙ\n£“ëI»iÓ\\·lJ‡2æ=´Jc‰å\r‚>n}*ì<4³%ëÊÊÍ”À9`7\nó½>T‚6QÜm¶9Ï ş|ğkÑ|êÂôÆ±¯ú¾äãæëßóÿ\0ëÖR3¦š•™áöò°ó¸Ç@;Ö´²©>ob+*ÍªÎsœæ´í®Œˆß#³ÎånIúWEîsM\Z1™I³g®WC¥İG\n+ı¨œV\'CŒà÷\0çœw®jİşUQ!# *’O½hAÅJ4Rpğæ³’LÅIÅİêfQ¾)¢.eœ†È®r¼Ò¡Ôìb½…­ïlÍÍ«¯ØÛ‘Ô“œõéÿ\0êÂÒo\r¸’†I\"|O\' ô®¾ÖşZîn€£0\nå’³;©Ë™\\à`ğ´.÷p\\•¾s=¬QÈå¢Ló3œŒN	ïÇW—\\>û’0\\m=½+ßoïì-ÖTº»	“æ&HâG=‡ùæ¼CZğ^Kä¾äF\"3Œï^ÄıG56³ÛsØÁÎrO†›®Ï¦Hï\0Œ6”#p=3ü¿•vºoŠü¦VYp—±´Rr§¹ìpzñ‘øcÍ-ÑY¤\0Œ}yöö­5!ğ®Ì•ã=zòj%\ry–çd£Å©­¨Ş]ÿ\0j^_ÍâîIÛÉR\\\r¸à\0Ê‘éõ¨t•[Ü4HÒ)xÁP rv=@->é`¹Îu7âËSÓáµº“,ra˜€¬ŸÓ‘ßcV´\nhW0D×6³‡·+±`Ë60ÙÇB§8íÓkªe%g¹ÅŠ^Â)­‡Bµ)m—7[‰ZFYU|ÄÅÂmã‘“‘€7Œt¯Gğ%¨¶mMYYt`€r¿Äx={çèGZä.à‘7º«|ªÈ¨Îk­ğ=ÑMFMŠˆ|½ªª\0ş<ş´Ûº<ŠzÎïsÄt­:ûTºÙÃ,¯ÆB!lÜ€¿Jï¼=à­y¦ó.!š-“—\nŒ;‚2ïĞ}+ÑîµØa¶vµO6`>U`@¤Òõ¡xnÿ\0w şÓŒ±/¡¿°]L?‡¢)ÖK­Dà˜£]ü˜-ıA®ÇÃ:U’š¹ÆKƒŸ¨èzúU™5(¢áS“R–LààVN´™J”VÈÕQmiÄXãAü1¨QúUiu8£$\"äúÖ4×ä~\'&¨]\\Ü}‘® š5êìv¸ã<ŸÀTİ²Ò0üq{ÂiÙ›sêkÉ#HäG–DÉû Š+sÆWòÍ:A5ÉgvÁEáF}»ş9¬»§°°ıŞ~aòŒcéÛ‘Š×•Ù#ÑÃ¥¶ÊªDÓ6)Ë§óª÷>wÙ–éá•m™¶$ÛÂŞºgÒ®hÑËu)•Â”Èm­‚>˜ï]<ZÍæ˜¡D¥àÛŒ7;F1Œzb”§Ë+nn“”n6ÒõæT…_…mÃ?NÕÜxZhîïàµ¹¹6ñNvYI*øã:+š¼}*iœT‚FıVQÓŸ¥XÒ$[kÈÀ‘¯Ş\'ù¿•)7ñ%bgMNœµLõ©|?¬,h–ÒZŞÄ­„TÉİÇNÙâº¿	A46³E5´‘íÚtÆzñøü¹¯2´¸¸µ`¢é°FUĞàªö?z\'‚/n¯c¼[™üÁÍ¤Fwgù\n¨ÍÈòe‡TŞ…\'9ˆœTHJÏ:Ô’0ã§5›\Zî¢ñ,ğZÚ _Şíß#wùAãÛŸÂ¹V¦­\ZÒŞÅn–@£¶O\'ØzÔ°-åÏÌ°ùgıdüÏeêxõÅ:ÊÒËO}ğ#<ä`ÜLÛä={{b¦y‰äîf9Â¨É<gÔğ\rìH©iXfÍÄ£øäè1ÂôÏø³Z’<ˆ‘æ¹a‹ıOAÿ\0Ö®ÆÛMfÜ’£\'äVäŒw#§áWŞ(Œ^_–_÷p1ùSŒìîÄ”µk[wçİ92îÜûC€şÕNê9.åI#BaıÅ}?áP]²ØÆ§³F6`úàpOÖ¸á¹ó\"şÇmáòfp\nzÓÛüªu ß¼oí¬xÍüVRÀÚ¬Ù9ëšÑéd_•²‡µnë_5{hZiôé\n€I’\"NÜà}kt‹ƒkæDC\'¡ßZ©Â/Ş‹:ib4³1.ÈiÎ8ÒŸhg‚xä@û[€Fyÿ\0\Z˜Y]Èî\"¾P7³mçß×ø+Â’kZİ¼s#5´$=ËıŞ9ÀÇ¹\\z÷©”ÒV)»{Ì¡o¨[Ï W“&3„Éä}?*õ¯„ÎeMTy…Õ|œn9ÇßïTõ_„š%Ò³XK5“œmCûÈÆ:ğ~lŸ÷«Ká…uM«Å|b‘&¤BÊHó7pF2;w¢¦ş†­NdÙGPÔã¶UÜÀnt^}ØëV¬Ü=ÖàÃ3ß¯\"¸È\ZãıÕşb´´¿ùl¿ëµŸşŠ¸_sIÅr£»²†ãSŒ=Å†EÃ‚P‚¹£øÇ+ĞÉç#¿kg–JniWs’z~CÀâiÿ\0«şíH~óıj0cšC´ã­03“IIQş÷õ¦„\r\'ÍËgĞR¤{NsÜÔªZ¶?ÔµXÚ«”-†“^k$0ïÒ4_5Ùöƒ\'¥ox§ı\\_õĞ:æÏú–úV°ZÓŠjç\n÷²ê\Z«ÚYªì2`àö¿!^¡¡jßØ1Z%–\"nt9,{³çüôæ>\rÿ\0¼ßõÀÿ\0èK^ú‘UUÛBêë¡ØYx’Â÷f\nüeIÁ…t\Zs¬‚BŒã§ã^\'}ÿ\0±×Eşuê^\rÿ\0I¿İOëE8¥$Îj‘±ÿÙ','NADA','1212'),('2013896544','FRANCISCO RAMON MENDES','20/06/1980','UsuÃ¡rio Comum','MTIzNDEyMzQ=','eeff8d85','SISTEMAS DE INFORMAÃ‡ÃƒO','ÿØÿà\0JFIF\0\0\0\0\0\0ÿÛ\0C\0		\n\r\Z\Z $.\' \",#(7),01444\'9=82<.342ÿÛ\0C			\r\r2!!22222222222222222222222222222222222222222222222222ÿÀ\0\0t\0W\"\0ÿÄ\0\0\0\0\0\0\0\0\0\0\0	\nÿÄ\0µ\0\0\0}\0!1AQa\"q2‘¡#B±ÁRÑğ$3br‚	\n\Z%&\'()*456789:CDEFGHIJSTUVWXYZcdefghijstuvwxyzƒ„…†‡ˆ‰Š’“”•–—˜™š¢£¤¥¦§¨©ª²³´µ¶·¸¹ºÂÃÄÅÆÇÈÉÊÒÓÔÕÖ×ØÙÚáâãäåæçèéêñòóôõö÷øùúÿÄ\0\0\0\0\0\0\0\0	\nÿÄ\0µ\0\0w\0!1AQaq\"2B‘¡±Á	#3RğbrÑ\n$4á%ñ\Z&\'()*56789:CDEFGHIJSTUVWXYZcdefghijstuvwxyz‚ƒ„…†‡ˆ‰Š’“”•–—˜™š¢£¤¥¦§¨©ª²³´µ¶·¸¹ºÂÃÄÅÆÇÈÉÊÒÓÔÕÖ×ØÙÚâãäåæçèéêòóôõö÷øùúÿÚ\0\0\0?\0×H}©^½·LSô›…Ô´»kÅ\n<èÕŠ«nÚqÈÏ±ãğ«&,Íİj™’EV‹Ö£hëE¢â xªYiJS\Z31W\Z:Œ¡‡b‘ˆuÅFÑàô«¬§8 T,”‚Å6¥@ñšĞhıªbŠ-M;\'4P#cAÒûSÓYdTo>\0Ñ…QŸ6Ñ 0qşp7#ƒhÉä¹¬ıEËÄZeéØ‹>ë)62HŞŸ^Tønù|Vƒ±M£Å@ñõ¢ÉPI>Ô™HÎdçÒ³5=FÏJƒÎ»˜F„àq’\nÖºt¶‚I¤;cK1ÇaÍxŸŠ<AyâÆXíÙ`F;;š’¬t7c]@¤Váí€ûÄá‰Çøæ·´_ÙëA„M¶UÆQ8õãmipc\0*m>æ[È§ÃŒ9\"§Ô÷fSŠ‚Dö§i÷i¨iğİDFÙ0ÅJÊ)ÊL”Tî¸íE2N£^²’ïE¹Ü°¹Uó`+ŒùˆC\'Q¼¢­ØN—ú}µäjÊ“Ä²ª¸ä\0ã½h¥cèıŒŞéaUÖrÑ(f)>u#ØÉÿ\0\0ª,¼ÉP<u}–¡‘˜ÑÆxÊüXé&À=ÎTœãjóä?àUåQê6(û<Å€\nî>#şòüÄì|¸íĞªå™³ÿ\0 Ê¼¡Áiö$\0sÇ½fÕÎˆ7tt²İ[m™vöªs5ĞÛ¾6>€óUõ;uÊ&X·5‘›[ÏQP¢¦•&ã£G x\ny¡Õ.4ï0›s•‡ _Ò»ãkË|+!‹ÅZYbpûĞó×*@ık×6V‹c’¢³(²vÅe£ÀçŠ*ŒÎğÇÅdÜÄm¼CepÛvjàweD\'Ğ\0%xuíÒyU•®XKs¤Î° {ˆöÏa¥ƒ 9ìY@=8î:Ó-˜‡¥BñJ»nñ]ÚÅs‡Šd#`Œ©›$T˜#Å|u{k}¨Í5¡f0âŞCØ•$äßD~Å\r‘#O*1œ(äû\nî|O¢6«êœl¹o´Å…Ç’~˜-Â¸}Fe…Ì¶:f³iîwAÅ+\"»_yÓ¤l„‚8àqìh0Ç»‚Ê«%Â£äÆãœç®*ÛÊ³ aPÕ‡{îhh‹&ÒİäHbRìîÛT`ddûô¯còò+ÄìtëOP‚ÎÚ2ï!Ú1üş€dŸj÷kk³µ†Ú0JC\ZÆ»ºà\nÖ•Ö·)4Gµ}¡ç½v9îw¢\ZkAšµEœş™·7:Cm!òÁ#>S|Ë…e×3W:çüWâıÂz¥½ÅíÙ=»‚•ŞE21n @Î	ö2×¾:ŞK¾-NŠÙu\\7˜øè¬`)pwı9,;÷Œn´¦Òn-.5+HnTy‘Å$ê¬Äg€¹É\'+Áu‚Zímnâ²ô²İ4¬ÆI%“t’?ÌÌI±=s‘DÒ4NiOEbèÊú‚+ó‡Ï5sN¶–úş(@2Í\"Æ€œe‰À¬ï›z§´¼ºÓdûU¤òAp ì‘¹8=¸&³JìÖR²lú;Dğ›¡ÆolŸj1ªÉ1É,@Á#$íÏ ­f¶ç¥yß†>3éùV:Õ¤Ö8ÕÏ˜Ó†!NKq¸g{¯\'½z~—{§ë¶+y¥İÃunØù£lí8:«`Œƒ‚3È­ìq97«(5±ÇJ+e­=¨¢ÄÜÀñïağ½±´´)&§\"ğ\"ê}ıâ}†kş6ÖuÆÍõü²aJ€¸@ÆFœ\nÄÚœº–¥=ÔÎ^I³s\\œòk©ÁCC—ÚJ£¿Aeˆ`ÎX™ô¬æ“5#¾MVÍs=ÎÈ¿u-fùğG$`sVCg¥f¯ vâ¥YÙ#4§êU*ª7LÑ8PO.ÕÀêj\'»,0£	Éêy&¦0Öìªµ“VC™‘WãƒHíYÃÖ§BxúUõ1\rÇNñ¿ˆ¬Dk·~±Ä¡3;2(\0m\'¢¹xÛµ²9\Zw=\nét\r@ìò7C¸ü¸üëŒÖt¹tùŠ±Ü§î¸úõ¦ÙïK2½Ö$o“åò„ööÿ\0>µ”y®wT„Rº9\\sUÏ´gn}ª˜PÒ¢…€5RV3‹ĞAÀ\0`Š”(u÷bâ(ÂBŞ§üóùUe84“º3¡@íJßxS€É¤Æd U	25\\Ô¨¿Ê\Zv«QÀ[ ¡DÑ½áBGJ+ ÑtøŞfyT£€zsESÓC$¯©j(ÕØ]»év¶§Õ B.æ¹8;S }zn:’ŠÒ‰uûS©„3îTUóíÀÏ8íXİf\0÷4QYÔø˜©|µŒ*±Ë?Š¤EP¬¸Ç?J(¬$4VŒü¦§òÔaœœÑEhOrHÔ1[\Zt(î7\n(­éîLş¨‚Òµ…ì½~´QEk%©ÏìÿÙ','RAMON','2013.2'),('2013953416','CIDRONIO DE OLIVEIRA','14/11/1989','Administrador','MTIzNA==','4d2dc4a5','SISTEMAS DE INFORMAÃ‡ÃƒO','ÿØÿà\0JFIF\0\0\0\0\0\0ÿÛ\0C\0		\n\r\Z\Z $.\' \",#(7),01444\'9=82<.342ÿÛ\0C			\r\r2!!22222222222222222222222222222222222222222222222222ÿÀ\0\0s\0M\"\0ÿÄ\0\0\0\0\0\0\0\0\0\0\0	\nÿÄ\0µ\0\0\0}\0!1AQa\"q2‘¡#B±ÁRÑğ$3br‚	\n\Z%&\'()*456789:CDEFGHIJSTUVWXYZcdefghijstuvwxyzƒ„…†‡ˆ‰Š’“”•–—˜™š¢£¤¥¦§¨©ª²³´µ¶·¸¹ºÂÃÄÅÆÇÈÉÊÒÓÔÕÖ×ØÙÚáâãäåæçèéêñòóôõö÷øùúÿÄ\0\0\0\0\0\0\0\0	\nÿÄ\0µ\0\0w\0!1AQaq\"2B‘¡±Á	#3RğbrÑ\n$4á%ñ\Z&\'()*56789:CDEFGHIJSTUVWXYZcdefghijstuvwxyz‚ƒ„…†‡ˆ‰Š’“”•–—˜™š¢£¤¥¦§¨©ª²³´µ¶·¸¹ºÂÃÄÅÆÇÈÉÊÒÓÔÕÖ×ØÙÚâãäåæçèéêòóôõö÷øùúÿÚ\0\0\0?\0÷Ê(¢˜‚Š( Š( Š( Š( Š( ¸ÿ\0üFÑükv²]j¡h,àÆâ0pÌOİRF3Éë€pqÑk:Šèú¡©´fU³¶’àÆ7RØÏlâ¼+Ã:cë·\r®jl·Z•óùòJÿ\06Ğz*ç \0ØÇ@+:•8İšR¦êK•KñãÆ3\\Ëö]OŠÄ¢<»*ö·€O¾}jxãõÙº0ø‹IcÏ3Ú+\rƒ¶P’}yÏ§İ[éF4\nJÎÕ|9m*¼Ò[DÎT‚Ìƒ$zf¹–3¼N§‚í#½Ò5½;]²[­:ê9âaœ¡Î+B¾qÑn›À^;-¥e±º;š\"ÙÎşF¾ŒÖXÖE9V\0ŠìM5tqI8»1ÔQE1Q@^5ğˆ‡ıC.ôSW‘ø7Q]?Bµ’H¦”ù!ñqÛ½{ˆÒå´±%´¦)Ü#¹yÜs’W˜XøsOºÓ’ÊX•(7l|râd­ÊÎ¼4%~duZWˆ¬ïâß\ZÊ¸$\0çTuZ} Ú%½ÃÊÃ àÏ¦I¨m4Ä²š;{m©0ˆÔ\0\0¹Àÿ\09©ßA²Ôb®Ñ›Ê,Bï8€}x¶®%%{=ùEò¦·<¯ÆŠòx—M™Q€ecƒÕNqıE}£³6f[ïy+ŸÊ¼Âîké/¥ˆ7Øíä ‘“	Æ{àWAğœßIáwšòGu’Rc.sÅz4gxÚÛn\"²½÷;Ú(¢¶9ÂŠ( tY‘Ô2°Ád^s}§\\’İrH‰¸äxç¹½¼ûÆzş•©İE£i÷qÜjvå§”ÂC…Y‡FÜËòõã\'g\ZñRƒ7ÃÍÆhÊ{à·¯¾İ™”ãq* ı2jõµŞèäF<ƒî0k:Îú@H–ÎWpp|¿˜Xfñ„QÂaİ€K‘Ÿ ¯-k¡ë¹.SœÔ¢›[ñ%Ÿ‡âª]aç8ê ä#úWµiÖéš|6vê(”(¼Âú‰ üSÔí5iã¶›ËO&yäù7Õ˜n™ÉÆp;qÀ¯j¯^åŠG‹R|Òl(¢Š³2®¥©Yi\Z|×Ú…Ìvö°®ç’C€?ÄúÉí^Oâ?:}°x|?`÷R‚@¸ºù#àŒ î`Fzí#ŠËı¡/£kí\nÁdıìqË3¦Š…>ŸÀß—½x©4€êüAñÅ$Y\"½Õ$Kg-şoû¨ö±û¤Xn\'ùÖ§ÂYí×Æ&Òãúe¤°.ÜõáÏ#‘Â}q\\\0œ•Õü5İÿ\0KÚ@lÉÉÿ\0®O@Ñî§µ¦‚Şæ&vş\"†õåsœğ?Â¶.­ôÿ\0i—:µãgìÑ´!ì1ü#×·¯8ï\\±¦Ëo¬[Ã§Fÿ\0j¸t‘\'w\'c–}ç=GİóúUo‹$¹¶ğÍ–‚Ó£Ü]6û–] º&1•şÍƒ‘¸GLŠÂ•(FMØïÄİS‹Rİ7©_I©jwWÓ\\Êò¸^€±$ã=¹®ŸÃ?|Ká‰i~×ª¡E­Ù2D\0\0r g?)ÀÎq\\qëN\\ÍnyçÑşø×¢jÌ–úÄM¥\\±\0HNøXğ>ö2¹$õ\0rÕépOÌÏ©,2(d’6¬Bê+â€İûÖ•‡ˆõ­.«ßZBÍ¼Çopñ©lœ×\0~TÖümÔ$»ø‰uª*ÙA(@9*TI“ï™ú^w[2Õ·ã_RKƒq×Na‘¢	Áä|¡G5„@É ÏzèüyŸãk©›lqù…	ÿ\0–mÆ&¹¿J–Õ•o`g (u\'=1š/mJŠNI3ÙşÔòµXŞqz\'óJ9éÁğàã½y‡‹µçñ‰.õ\rîafÙ±8XÇ\n\0=3ÔRk²×5›´¼\"İ!…rÏ» ı3şN+Ì	õ¬h·fÙéæœªQ‚è„ô§ö¡@´\ZØòƒÚ“©9¦†É8çµ.s@6æô4Ä<‘ïJXN1Q‰X×šMšJLóCa¨©ñf®·Ği°Ç\"²,k…“ è¤\0~MÚ¹•çšnæ`	ì\0éè1J9©Š²±¥j®¬ÜØş)’0¥ö¨\'l*Œ‰-ÎPNiìÁO\\T6¹Ø1Ò§Û““ŒĞÕw\'ÏAÛŠ(nô§”4Q@Àuµ<t¢Š\0AÖ«ÏÓğ¢Š>Üâ:›­P3ÿÙ','CIDRONIO','2013.2'),('2013961211','DEYSE THAINA VIEIRA DOS SANTOS','20/07/1995','UsuÃ¡rio Comum','MTIzNA==','ab381b2b','SISTEMAS DE INFORMAÃ‡ÃƒO','ÿØÿà\0JFIF\0\0\0\0\0\0ÿÛ\0C\0		\n\r\Z\Z $.\' \",#(7),01444\'9=82<.342ÿÛ\0C			\r\r2!!22222222222222222222222222222222222222222222222222ÿÀ\0\0n\0m\"\0ÿÄ\0\0\0\0\0\0\0\0\0\0\0	\nÿÄ\0µ\0\0\0}\0!1AQa\"q2‘¡#B±ÁRÑğ$3br‚	\n\Z%&\'()*456789:CDEFGHIJSTUVWXYZcdefghijstuvwxyzƒ„…†‡ˆ‰Š’“”•–—˜™š¢£¤¥¦§¨©ª²³´µ¶·¸¹ºÂÃÄÅÆÇÈÉÊÒÓÔÕÖ×ØÙÚáâãäåæçèéêñòóôõö÷øùúÿÄ\0\0\0\0\0\0\0\0	\nÿÄ\0µ\0\0w\0!1AQaq\"2B‘¡±Á	#3RğbrÑ\n$4á%ñ\Z&\'()*56789:CDEFGHIJSTUVWXYZcdefghijstuvwxyz‚ƒ„…†‡ˆ‰Š’“”•–—˜™š¢£¤¥¦§¨©ª²³´µ¶·¸¹ºÂÃÄÅÆÇÈÉÊÒÓÔÕÖ×ØÙÚâãäåæçèéêòóôõö÷øùúÿÚ\0\0\0?\0ôb)¸©JÒm¯—hì\"£&Úi\"šE`kş0Ó´@ñïÜ¯H•»ûÕÂ]üNÕ¤-öx­áãå,3Çé[ÓÂÕ¨®œ’=fŠò­;âôs…Ô-á–3€YFş‡ô¯CÓ<A¦êğ«Ú]ÄìFL{†åú¢•\\5J_$Í)§õÒ+†Í!%&)ÜT†šzÓTÓM\"´nôìS’³h”Æ“\\ŒüLºU¡¶¶”}ªLƒ´ò‹ëõô­OjOcd±BÁ%ŸpóøO×‘ŠñNCuvádyïšF9-õ®Ì&óKaIØÌ¸–K‰K1c“œÉ÷5_\r,‚Q¤sè8jHËN°§Ş|\nì´}!Esq^µìJƒg“uÃI.}ª+Èf°¸GBÉ·¬§OÖ½.K!³úV&£`%‚HÙ:â£Ÿ¸İ=4.xCâ	S†±#á[–9ÿ\0¾¿Æ½=Y7)zŠù©ákk¦»¯\\ğŠ ½·Mº˜‹°H]Ç!ÇQƒı=«ÏÅá”}ø%ÑÑ¦O¦‘^qc¤+OÅ!€¾„2‚)ø¬¯ŞÍ-_ìÿ\0g*ì†?›± õ­C[WV«%æÉ‡Â7ø©fx-‘ˆe	œgùW\0p°õæ¶|erÒø¢æ\"rTíëÓ“X/•4?.zÖ½Œ<yi$CÜ›E„\\ø7—üıkÕ ²Ë\\zW™hí\Z®ö\rœ\n£$œJô{\rT³,oi,jxÜİ©Éêk\r‰åµ\0`\næµ›+yšgg÷@\'Ôê’¢Û|®@q€ËÁ®?Q¼M2\'ÖrHÈ@wXÈU$ñ¹ÈÇ­$¹™RvZœŸ‰-¼—1·w8ïïYQŞ½¬«-»9N\nr=k¬x©£»¼-ß0Ç=k•¼¶He\nŸq²F}z\Zµªåf2_iÿ\0 ]¾¡ X]Hûä–flc\'ÖÂü,”\\Cæ©hç9º‚ãÏäk»áÕ‡-GÓĞB\0¦\ZŠiëS`+hQ%½«Äƒ~ãøş¬zWàŸCâ	¯cİ¡òB¹Á,}:có®Ï5¾5Z¼ˆ§ğ£Ä¾!Ù5¿‹¦6Ë|÷ç9şF¹Ğ«	%8À8µÖ|Kumn9 ¸W\"=¬±7(sĞšó{Û‰dP}z×©‡»§IØê´Ó<P›ëHšYNT®‹N‹Zk6ñ˜¨O”mcê>ñÀ>ÜŠÌğ$ñÉ·gÃ â½-c†/5ßw§Ö©ÊÚ\ZÆ<Êæ]Ê<šiFÏÊÙJŠ+%ºTf†9YI*ÍÉòHÏ©­T–Ü#“vX\nç³ ŸìS³ eJ•ìjâˆup°Æ=kÌüTaRµ[Y7©„³°\\\rå˜0ç©ùy÷¯O¿¼ïDÀ=ÇJç×À\râ£\"Y¿‘x„ì‘òc|äØÉ$òsÁíQv‘•UdWø_wqˆd€ÜÜG†ûÊ	×¦Gã^Å^\'áE½Ğ|Gm$ñºGÏØîU<¶?)\rô<óİkÛ;WŸŒï.DvQœæ¤Ç‡­rØg/à]\"hm¿µÑècŒÜNŸO»]&µkuy¤Ï\r•Ç‘9_•ˆÈoöO =2:~•[Ár‰ü±\0ÑätÉïÎïıšµóÅwfk–¿1\'t|é,ñê7WQ4r£ÛİÁıkîÜÈÊÃ;W¼xÇÁ–$³yTyWÑ®c‘‹˜wÏ¯^¦+Ä/­n,e¸·˜üğ±CéÇÒºğõãV:nF×ƒ´=bçÍÔ4èLÉ†1/Ş‘CïÈ u%~™ïEåÄöÃË(à\rê3Ãzr+­øYa—ƒ¬g¶–ÖMóÉö—wåS\r´/ûY{í^_ã/A¢|GÖ-íKO§´ªÌ›ŒR•M§Óvì¯cÓMs2éÍGFuÚdİDæşèYH6ˆZPÃ×#t¨õXtÔ€¥´³]ÊËƒ)S\ZOE<úuªú]İ¶©:8ÉëÉ­ilà†-Ç¤ÒRIV[œì’-¥š@å@ÀúVß‚üCáı\ZÂ}RïS·FrccæğßóÌÄ‚Oğôöæ¹ËÉZKÕ ~ïqZókèJîİP$b3Û<ÿ\0ZP30­±Ü]Ù]jVÒxŠÑÚ8u{éd–É@Ó’¹=ñı=øöÊŠòŸ†¾mî—wc:³Áñ¼y=Éù¿ ¹üO­z§E®K|ü¯¡Øvx¦–¤üi½ëœe_26‰y¶XLIÎÜ¨ÿ\0ÇMk••à—cm:ÈŠ\\¬l%ß–e+veõÈ\'9ÉÖ·zô³xûÑf4^¬CÒ¼câT)ˆ’—\në¸äñ¹Ù‰úA5ìç¦+/SÒa¹†Y$72¼$İoÇ§§nùópõ}œ¹Ú¹à–*×ü5o5Ÿyötf%öÆŒA#1¯áŒz×<î÷¼Ó;<Å™˜ä±=I=Ívß´?NÕî\ZÒæ%ûHY>Ïù¢cÉVÎáÓ°Û€\rq#µ{Ô\Zœy’ÜçÇUá}b8\\Z]ÊQx?§±?Ê½+Y$ÁyÇlœ×‹ÄA8\'Ÿzî|-âI%Ä¥˜FOqéSV—ÚFÔªı–vVx^\ry‡‰ÖXµé2Üm<ÿ\0ëÏç^ —^dÃw sZâ<{jEÌx&\'Çü€ÿ\0ëV4´‘¥Ux7ÃıMl4ñİö—R>á¹O0“ÇAßÔ×¢$«([«ç¦Óšù„\Z]Ç±©©ç“—1Ïí|§sFãë^)àË¡İ­¥ôÒ>˜àŒuòI9Ü\\uÈ¤òx>ÌMpV£*R³5Œ”‘Éø\'SI×fMNòÕ`ûHîZ@¹ÚTb{ã$}\rwÉ<W*\'‚E’)>du9B\ryeöˆö<‹„’&ê®“Ç|8ÏZï|.sá»01…ª\0#\01\0rOaë]¹¥HN+—£3¥µ\'Öµ»N{ëù\nDTe»*æ¼ÅŞ7ŸÅ\0[Àmb‡>Yl™N¿ßÎ­|PÕ^ûÄKd,Ğ.ÃĞ¹ä·å´~õÃƒ‘Å^	R[²jMìŠîÈÁ˜±ïšƒ;ºõ«’Ê¨ÅUuÚÙëĞjÆHn*T•‘ÕÔá”‚ìEV%óŒô&Ì¯,iïôMhêQ…\r¶æ%Ë)7¸öéWu+e¼´‘dRw&ÔWŸY\\Ki,7¶$NFzc^¥ß®­§­ÀˆÆI ©9Æ=ë’¬9ÑÙJ§:³Üócæ7-@[Ôbòu+˜ÇA#cóª¦º–ªçVv:â½çÁ÷Íá-6v\\7•ås„¦¹ükÁWŞ½Wán¡=Æ—y§¶\nZH­\' }Çš“ø×:ÔîºIÙŸÿÙ','DEYSE','2013.2'),('2013961698','FERNANDO VIEIRA SILVA','01/01/1991','Administrador','MTIzNA==','93581b2b','SISTEMAS INFORMAÃ‡ÃƒO','ÿØÿà\0JFIF\0\0\0\0\0\0ÿÛ\0C\0		\n\r\Z\Z $.\' \",#(7),01444\'9=82<.342ÿÛ\0C			\r\r2!!22222222222222222222222222222222222222222222222222ÿÀ\0\0t\0W\"\0ÿÄ\0\0\0\0\0\0\0\0\0\0\0	\nÿÄ\0µ\0\0\0}\0!1AQa\"q2‘¡#B±ÁRÑğ$3br‚	\n\Z%&\'()*456789:CDEFGHIJSTUVWXYZcdefghijstuvwxyzƒ„…†‡ˆ‰Š’“”•–—˜™š¢£¤¥¦§¨©ª²³´µ¶·¸¹ºÂÃÄÅÆÇÈÉÊÒÓÔÕÖ×ØÙÚáâãäåæçèéêñòóôõö÷øùúÿÄ\0\0\0\0\0\0\0\0	\nÿÄ\0µ\0\0w\0!1AQaq\"2B‘¡±Á	#3RğbrÑ\n$4á%ñ\Z&\'()*56789:CDEFGHIJSTUVWXYZcdefghijstuvwxyz‚ƒ„…†‡ˆ‰Š’“”•–—˜™š¢£¤¥¦§¨©ª²³´µ¶·¸¹ºÂÃÄÅÆÇÈÉÊÒÓÔÕÖ×ØÙÚâãäåæçèéêòóôõö÷øùúÿÚ\0\0\0?\0æ–*”GS,u(Šõ+•Ä~Ôá©Ä~Ôı™À®\"áµN#ö§„ .Vò½©D^ÕkËö§í@D]±G•íVÄtyt›DÃŞŠºc¢ÂT¡*EJGíL›ˆı©Á8éSˆê–¯¨Ã¤Y‰»µuf¤Ú[&ôDû)ÁkÏ®›Ä\Z¼[å™’É¡0{qÔ}­f$šÆŒû¢h×9![*~£¥s,]7.TÎ§ƒª£ÌÑêá)Â>=«Âş MnÙ’@©uŞ@~ğşğÿ\0?Îº1µt©_Tr´Ó±_Ëö¥òêÈ—Ëö¥pE3µhÇíE²ÇÅH#©U*A\\€%q¾%’3«o˜4‘Û(EŒ7Oé·üŠîüºáuä2]M!|2ÉÀ=±Çô®<mNZ|½ÏC.§ÍS›±NB¥w$[0İd^_Á)h„½sÖ¥kSeg.×,Ò}ìZÉXeTÂ¨$œ’Fr+È¥M)6{5ª6”M\rJúŠ-0NÙF@<0n?ÏÒ½R¼«A¶I5í+Íbª²ç8î1´~\'½yc¯rƒ¼O­2µ.ÏQVD~Ô¾_µks™Š²ÑÑEÀª‘Ô¢:•#(—1+ùuçŞ(´’\rYÎÇ‘ï7gÿ\0¯šô±r3Š4[iGúß˜7Ğc©5Ë‹IÓ¿c¿&ªÛ¹çwÊ±œrƒ;¾CÅE„‚#×fåcsëM±…®/bæw\nw&¼è+è^nÚ\'…ôK›­RÚwŠD¶ˆy»ÊƒÀ<ãğÍzRÇOµµK{x¡LìBõÀ«:õ©ÅAXğjÔu%r/Ú—eXÒùuW ¦ÉÅe£¢`³*¢qÒ¥ÔˆÕ\".ã´rzV­«¶\\(ÊnÑD[8®;Å±o½]¸?º\nÃÓ’­w‘ÂÁ¾`8çüŠå¤ğÆ¦ËN«#ğo3 äç’õçâñ\\Ğå‚¹êàpœ“ç›µ2¸ÓÜ’rÀ{\ZM9›¨ÛN™9U„cä_¥z[x62Á®îUWû‘rqSşø|=abÆH ıâõË}yéœöÅa†rºr:ñ<­5Mëˆï`Æ}Uº¯×pG\\ÄqO¤‘1CË8Î9ÇéZ¶:»2¨¹‹ƒÀuş£üı+ØSº¹áÊ‹‹5tlö¤·»¶¹r±H€Î1ƒÆ¬•â‡\"9J¥(©ÊÑSÎ)Ä2½NqÇùÿ\0\"¬*$d})–ßêWpÁ¯ëOvÚ3^<ª9ÊìöiÓäŠCÃdÓ\'¢!¹yçœS!$Jƒ=9ıiëò¦Ú¨¹ª#<5Rtó.ÜÆÏò­c‡ÁíTôõYn.‰Áa1Ï®01ıZ¨ÎÊâkQ\r²´Òå>U@ŠBz>˜üë\ZæÙ\\[’¡Àã>ÕÑ³³$ÿ\0!B$*\nŸ½Ï_éøVl¡bŒ†§ğŸ™ëZQ¬Ó\"¥4Ö§=Ãé·Ë Ãmê7pG¡®Š÷_±±´¾yJò$V4$\rÌqıO#kÔ\"—EEìŠæ5­PÓ­ÖŞ-FH ‘J„W99$òvıAnûêJğæGœéûög{§x¯NÕo¬.ĞÍ»9“™ÒÙ\\õÉê3b¼>M].ö‹…A‡yÔ˜Bg¦>\\vâŠÁNCt‘ïz~å·ØìYƒ°%=M>I?{Œğ:ıi°É–c‚2¥SŠo6æt?ŞÍyĞÕ\\õ§fs.ïlTp­íÍ2ÜìTÙéNvùğ{Ñ}GĞš&ıÖ=ºÕ\r>Q«\"»(Çüsş5e$\0àŸZÇµ˜›¼î9a“ìÉ¦±¹æìC“Îö8>™&³®õœF#¿¥^b¸ä`ç¦9<Ö\rø†=åAPOİ#®–äT“FMöçf`Ù$ä\\gŠìd»´‰bFiNW8ã?¨Ò^Ü>ò¨ÛV¹Kµa„6Öf,¯şĞéùä×©;Æ›8 ”ê¤rO£j]­Ô{cõ¢­@]æF6<•ë÷Ç±ş´W<Öß“;½„__Èöíæ[2)¥ »g$gš†Ù‰ÔÜv4Q\\T>èmSâù›êNT÷â›pOÏì2(¢¡n\"2çjçÏ¤¬šÄŠ\0!Á?Ÿô¢Š:1™zÍÔÓÊw¹#\0…ÉÀ$àvÏZä.ï.!vò¦xËŒA#ÓŠ(§†øÍk|–—=õ«¼ûK+ìÈÏ\0çõ¬o»e—?êĞ:Ÿ|ŸğQ^Üÿ\0†¾G‘KøÏçùŠwÜ\"“&öàQEçÉµ±êF)îÿÙ','FERNANDO','2013.2'),('898989','FIGUEREDO','12/12/1992','UsuÃ¡rio Comum','MTIzNDEyMzQ=','0a68d85','SISTEMAS DE INFORMAÃ‡ÃƒO','ÿØÿà\0JFIF\0\0\0\0\0\0ÿÛ\0C\0		\n\r\Z\Z $.\' \",#(7),01444\'9=82<.342ÿÛ\0C			\r\r2!!22222222222222222222222222222222222222222222222222ÿÀ\0\0D\0m\"\0ÿÄ\0\0\0\0\0\0\0\0\0\0\0	\nÿÄ\0µ\0\0\0}\0!1AQa\"q2‘¡#B±ÁRÑğ$3br‚	\n\Z%&\'()*456789:CDEFGHIJSTUVWXYZcdefghijstuvwxyzƒ„…†‡ˆ‰Š’“”•–—˜™š¢£¤¥¦§¨©ª²³´µ¶·¸¹ºÂÃÄÅÆÇÈÉÊÒÓÔÕÖ×ØÙÚáâãäåæçèéêñòóôõö÷øùúÿÄ\0\0\0\0\0\0\0\0	\nÿÄ\0µ\0\0w\0!1AQaq\"2B‘¡±Á	#3RğbrÑ\n$4á%ñ\Z&\'()*56789:CDEFGHIJSTUVWXYZcdefghijstuvwxyz‚ƒ„…†‡ˆ‰Š’“”•–—˜™š¢£¤¥¦§¨©ª²³´µ¶·¸¹ºÂÃÄÅÆÇÈÉÊÒÓÔÕÖ×ØÙÚâãäåæçèéêòóôõö÷øùúÿÚ\0\0\0?\0ñŒŒÕ#d¬x*B ƒêsÇ½FÜ{SÆ|¤br70÷è*Y,iÁ@8\rÉÏZ•¶Ny(>÷RxÍ1È\\’?—ÿ\0^ºë=\n=\").uV¼‰·$8…9`ÄwqØä©À#š‰ÍA\\Ê­UM]œ’³(#\\éÈëZ:sÌ¶Ó¬H\0w‰\ZM ºç8ÛùLòk¦‡R½Şk„™ZrL7,æ;œo¹É\'Ø\0CV\Z!•n,d”ì“ÎÎÍñ„U\0>ğùØg„pk)UºÕÒÄ^.èëíleÒÚ-:ÛùNùc±ãp¤1VUˆ	\'k€Iäú«I{t$ùâR|é\ròÄN*2À|¡¸9àô­¹õ±óLèŠ÷©„}¡\\¶åÉç#w\\ä\0s\\¥Í ›]¾–8]`e•ĞóIP¬2	\'•¹Éä½k’\ZŞçŸI^üÄÍÜL©.Ø™$·U^2ÇÜöìr&Ó–ö–×2¿î¦“gÏÑb0Éèzg€j¦­\rÉ×p@²+‚Xqçç1Ï\\zsõw,6ñîV?º\\(8Q¸äv>Ùk¢Ï—C±ÆğGD4sgmtĞÉûÉ³ğˆwì,÷²ƒÃ(\'pf@#–=‹– îÇaõÏé^‹ª‰eºÚ-”Âe_€!ñşÑ;sümã’“Ã:‚_­œ…#2•\nIf\\–ü ç=28ÏT§^Lxj±³s}ŒFÈTlõÖ¾A±ÎÒÍómêxÏ=û~~õcPÓæ°”G3.6nÀm³.â7!#‘Áë„uªDOÊºthôM]½Ë³3Xr£¨Ç§İª\0V-»Oğ¦“»œ08 c`Ã|Ù<İ?ÏáLvEû[Cw{Wæ#$¸A#?ÿ\0õ×rÉæ¢¡$îÊ¸E\0\0 ãw?C3šåü)¾¨’Åv°H‰/ 1a•+Æ\';»rMnÙC\"˜nnc”¼‘yår£,6†Éä‚N>§ ®*÷rô<ÌSnvì¿ÌMj(Í¦Ÿ<2Ï\r•Ë“pª£(£fX/gtÜ¹Ür1Ÿ¢Û©EnÅ`†WK³…ço$2¯N:ö©õ+¨n­‘üÙH·ÜñÅ,§Œ£$)QÁËeAÏ\0“Át^+¯Eq~É¾7‰Õå“#îÛ›«1<àáƒœUbW2¤Õ¶3¯ïµ\r:îêÑç”´}[Îc±TğpAİ‡JÆâ{­]`hVW“	ÇÌ@Áän?^Iôì\r\\ñ[|C~-»®ÿ\0v?Õ¤±R3Ó€H#úš‹a~®’7–J™\\@(rÀ<œİFGboNK¤m¢§tµ±Rı&·óA´Ë¸¢†ÒŒsAã8÷éŞµ¼şJD)‰_(¯ù5¯~÷&)\'Œ¬¶í5ÂZ¿Ê‚GósƒŒ1\0ô†s““§¤WW¶–¢5ËåA.G8ùNx‡ù4Ó¼u\Zw†§qâûù\Z\'¹¹´¹&A#h\n;±·ôÈÈâ`¾·›Q…î|äPŠ0ÇÌŞØ¶01Î9éùŞ(&­}mrêÏåÇ¹!ó“Ës€YùìõÅS}6ôÛ6I\"[ˆîçueb„lØJ³l›pp7v9¨¦¢£¯S**\n÷R×Š#Ä^]ÔO;³–[Ç$°S°®Ñ»•Á^£ø§¶«¦.ìBd2Fè²Fû@,§Ôdãéšê|^³ˆ¬¡•®¡EƒÌ“q\n»€.w\0AòópêÎñE¾Ûm.éÑQf‰‚ nÚFOËÇSíôâZË¹xi8òÅ=ÎmX€@ÎNH±­‹]-„VM#+yÌìcR¥•v¯\'¿9ã<qõÅK;h˜Å%Ã¢§š©?1^rqü¹=ëA.ŠÂmçP€lE Œ7Cœs¼dŸÀz\nÚrèŠÓoH—-î­ôÛÛ»Y#†[vù>o3j“Œ¡]ÜàAÇk\rQ&(¾Ê¨¨@W…Š¿9ÎFà¾11^F{…HC™NîA?ŸJÜ´˜F†¸gBßTÏ+ƒ×wo_¨3(ÛS9AG^¢¶¥åÁqo\"ªNÀ±¨ûş`\'\'¦Ì;œpÀæ[y„‘9EH®*Aàƒõ§&ç™˜¶å2\0Ä¹5IÇ;¸´ŒR7§MBèìµûx¼Ù®¼ßµ<¾QIP¾pr[qÆÓ‚Ã²:fÙMäê–×°B°¦B.x$‘Ã0ü+¢…íuOÇ²$3Û\'–†TŒ´›båãß#‚sŒpO,sGsnê)ÁPq\r¿*s‘_ş½sRw\\¬á ù—#-Í=üØ-ÒÅ/hk9ËÇåƒ	ÏÎ1‘œoøkOXmRşsUWy\0`N0\'u§¶9‡û{]I,aşû‘ğ@êxé××œ×G}q&›à¦„Iç1±‘(\n’0@+·\0’>÷\0æEt¢º•]6”S’¿Ô§Ô.åfÂ¢$Ã½O5©|çÊµwÉ4á8İµCI%€*Frs·<g‡\n´—…RÌÎ\0\0gœÕı7QŠİ’+ˆšKsË€@ ó‚2şïnİFMm8i¢:ªÓ÷W*ØèµÁ\n$r@‘.·ÈïæI:Är^@\'øyãœ‹Ë÷ºÒìbh£&‘i#åêsósŸ¥nê±M; ‹xeg’ßqTÀ•yà+À\08È5‡ï„W@¤ecŸ2ÄMĞöÀ^sÀ®x4’}:rJ*]Œkíb[‹hTÅä¬r	DH¿ Çİ#$’~c’sĞUî‹ds,—!wìÇ<ŸçšD{™l®Ş]ƒqÛ’FTuöÚ?_Z·§ÆÒBñˆ™İAG9UÁÉQÇ#,yö<c5ÑeuòÆœlV{Ûw“Î³•DJ²H¬„mVÆú•ÿ\0¾‡­Y¼»†4ÛFñ\\7Ë#|ƒsä;†\0ç‘Œtâ·ì|-¬$ImgbD›åe‘rÄm]¼å²‚{ã¡¯‚íÉ´jDËÌŸ )1ÎLÃ»#;NqêÊº‘êÌzmİ³ƒ‰‚¯’HàTú] ¼»mÀÎ;àŸOn•ŞØèK{Å¶˜M;ñ·;ŸËROÏ„+´ªeŠç zaªÛÍm§\\ÛAiä±Áv†dÚ6epÄe°ÏÊp{)Vºi\nxµ$ÔS2õ9nlµ=QĞyşlL±“…şî\0ëœœp*š+«‹4hã.Ì¨Tm]Ç¹Ëdàuç¦*;÷’[”*ç¶øo¼:gëØã¸ïT<¤6lÆæ11\n&ÜY¹ àÏŸO¦b1ØˆSÛ¹rŞ@«$ñaJâ6gE;Fq»§°üsM¾ºû]¼¯,òI+rÎù,I?Åê¿­MS_y­%Ï©w8e;@QŒnc€;“ÀÍ$~M´êDO<mY–NpH=Ëµ]¬î[Ì8Ó¨Ü8aŸaImå-Âyû¼ ÃvÌnÆyÆxÍm=Œ	NŸ<’Æ]†şPçH*9à20Ã¾iÇNÓVÑ¥Y³>7Ë†Ü8re_¶ÖÍó›{d÷.]\\[&;he¸‚f›íßr¶@vFIäãŸƒtÛ\r>Æ9Æ£pc˜LÑl’Ù[ƒósÆ:ryÃmô&»ˆH®dnÎPp¸Sïíƒ3Ÿ­eê1CôªŞcì2$x$rq×Ò³]‘„-ğÅ•B„ÒÄ£;‹²¦P×]£@ƒK†ëŸ:KÆF98ÀQÛ§;QEUv)ûŸ2“ëwâH÷ÜI$Q¹>K»lqÏ9ì;Ô{tbxÅÌÂ5V!‡®G^œQE`’¹Ì¢†YİKÓº³\r’\0;cnHÇ^˜\0~Zîæ[vYÛ!·ãqŒÇéùJ(«[›Gã+Z\\¸œ¸Pî	éÇ¿ùÉ¢F\"UQÀƒÅU½Ígñ\ZE”@ÑÅÄ„˜ÈBØ9Ç\'®L(ã<Õ¥1\"Hª…³ƒ¹w	n0~”QMuêÍ»’-bH|Ó+Ï¼?1çéŒV|ö‘.£wnFè£™ÑAöfPsê8ü…Uu*=Fió¿‘q“¤KèIVÀë²*¤d¼¹|*æCÀP@çß4QR¾&%ñ³ÿÙ','FIGUEREDO','2007.1');
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
