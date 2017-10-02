package com.nonlinear.fruit.retrospector.util;

import com.nonlinear.fruit.retrospector.model.Media;
import com.nonlinear.fruit.retrospector.model.Review;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by nonfrt on 10/2/17.
 */

public class SampleData {
    public static List<Media> getMedia() {
        List<Media> media = new ArrayList<>();
        Media m;
        Review r;

        m = new Media("NCIS","CBS","TV Series");
        m.setId(1);
        m.setSeason("S13");
        m.setEpisode("E23");
        r = new Review(9, new Date(1480204800000L),"Ben");
        r.setId(1);
        r.setMediaId(1);
        m.getReviews().add(r);

        r = new Review(9, new Date(1480204800000L),"Diana");
        r.setId(2);
        r.setMediaId(1);
        m.getReviews().add(r);

        media.add(m);
        m = new Media("Sense and Sensibility","BBC","Movie");
        m.setId(11);
        m.setSeason("");
        m.setEpisode("E2");
        r = new Review(10, new Date(1480636800000L),"Diana");
        r.setId(14);
        r.setMediaId(11);
        m.getReviews().add(r);

        r = new Review(7, new Date(1480636800000L),"Ben");
        r.setId(15);
        r.setMediaId(11);
        m.getReviews().add(r);

        media.add(m);
        m = new Media("Sense and Sensibility","BBC","Movie");
        m.setId(12);
        m.setSeason("");
        m.setEpisode("E3");
        r = new Review(10, new Date(1480636800000L),"Diana");
        r.setId(16);
        r.setMediaId(12);
        m.getReviews().add(r);

        r = new Review(9, new Date(1480636800000L),"Ben");
        r.setId(17);
        r.setMediaId(12);
        m.getReviews().add(r);

        media.add(m);
        m = new Media("Emma","BBC","Movie");
        m.setId(17);
        m.setSeason("");
        m.setEpisode("E1");
        r = new Review(8, new Date(1480896000000L),"Ben");
        r.setId(20);
        r.setMediaId(17);
        m.getReviews().add(r);

        r = new Review(9, new Date(1480896000000L),"Diana");
        r.setId(21);
        r.setMediaId(17);
        m.getReviews().add(r);

        media.add(m);
        m = new Media("Emma","BBC","Movie");
        m.setId(18);
        m.setSeason("");
        m.setEpisode("E2");
        r = new Review(9, new Date(1480982400000L),"Ben");
        r.setId(22);
        r.setMediaId(18);
        m.getReviews().add(r);

        r = new Review(10, new Date(1480982400000L),"Diana");
        r.setId(23);
        r.setMediaId(18);
        m.getReviews().add(r);

        media.add(m);
        m = new Media("Emma","BBC","Movie");
        m.setId(20);
        m.setSeason("");
        m.setEpisode("E4");
        r = new Review(8, new Date(1480982400000L),"Ben");
        r.setId(26);
        r.setMediaId(20);
        m.getReviews().add(r);

        r = new Review(9, new Date(1480982400000L),"Diana");
        r.setId(27);
        r.setMediaId(20);
        m.getReviews().add(r);

        media.add(m);
        m = new Media("Sherlock Holmes","Sir Arthur Conan Doyle","Book");
        m.setId(38);
        m.setSeason("");
        m.setEpisode("B8 Man with the Twisted Lip, The");
        r = new Review(9, new Date(1481673600000L),"Ben");
        r.setId(49);
        r.setMediaId(38);
        m.getReviews().add(r);

        r = new Review(9, new Date(1491868800000L),"Diana");
        r.setId(690);
        r.setMediaId(38);
        m.getReviews().add(r);

        media.add(m);
        m = new Media("Sherlock Holmes","Sir Arthur Conan Doyle","Book");
        m.setId(41);
        m.setSeason("");
        m.setEpisode("B10 Speckled Band, The");
        r = new Review(8, new Date(1481760000000L),"Ben");
        r.setId(53);
        r.setMediaId(41);
        m.getReviews().add(r);

        r = new Review(9, new Date(1491868800000L),"Diana");
        r.setId(699);
        r.setMediaId(41);
        m.getReviews().add(r);

        media.add(m);
        m = new Media("Death, be not proud","John Donne","Poem");
        m.setId(47);
        m.setSeason("");
        m.setEpisode("");
        r = new Review(9, new Date(1482019200000L),"Ben");
        r.setId(56);
        r.setMediaId(47);
        m.getReviews().add(r);

        r = new Review(8, new Date(1482019200000L),"Diana");
        r.setId(57);
        r.setMediaId(47);
        m.getReviews().add(r);

        media.add(m);
        m = new Media("Walking With God","William Cowper","Poem");
        m.setId(74);
        m.setSeason("");
        m.setEpisode("");
        r = new Review(10, new Date(1483488000000L),"Ben");
        r.setId(94);
        r.setMediaId(74);
        m.getReviews().add(r);

        r = new Review(8, new Date(1489708800000L),"Diana");
        r.setId(530);
        r.setMediaId(74);
        m.getReviews().add(r);

        media.add(m);
        m = new Media("Pride and Prejudice","BBC","Movie");
        m.setId(77);
        m.setSeason("");
        m.setEpisode("E1");
        r = new Review(10, new Date(1483660800000L),"Diana");
        r.setId(98);
        r.setMediaId(77);
        m.getReviews().add(r);

        r = new Review(10, new Date(1483660800000L),"Ben");
        r.setId(99);
        r.setMediaId(77);
        m.getReviews().add(r);

        media.add(m);
        m = new Media("Pride and Prejudice","BBC","Movie");
        m.setId(80);
        m.setSeason("");
        m.setEpisode("E2");
        r = new Review(9, new Date(1483747200000L),"Ben");
        r.setId(102);
        r.setMediaId(80);
        m.getReviews().add(r);

        r = new Review(10, new Date(1483747200000L),"Diana");
        r.setId(103);
        r.setMediaId(80);
        m.getReviews().add(r);

        media.add(m);
        m = new Media("Pride and Prejudice","BBC","Movie");
        m.setId(82);
        m.setSeason("");
        m.setEpisode("E3");
        r = new Review(10, new Date(1483747200000L),"Ben");
        r.setId(105);
        r.setMediaId(82);
        m.getReviews().add(r);

        r = new Review(10, new Date(1483747200000L),"Diana");
        r.setId(106);
        r.setMediaId(82);
        m.getReviews().add(r);

        media.add(m);
        m = new Media("Pride and Prejudice","BBC","Movie");
        m.setId(83);
        m.setSeason("");
        m.setEpisode("E4");
        r = new Review(10, new Date(1483747200000L),"Ben");
        r.setId(107);
        r.setMediaId(83);
        m.getReviews().add(r);

        r = new Review(10, new Date(1483747200000L),"Diana");
        r.setId(108);
        r.setMediaId(83);
        m.getReviews().add(r);

        media.add(m);
        m = new Media("Exhortation to Prayer","William Cowper","Poem");
        m.setId(84);
        m.setSeason("");
        m.setEpisode("");
        r = new Review(10, new Date(1483747200000L),"Ben");
        r.setId(109);
        r.setMediaId(84);
        m.getReviews().add(r);

        r = new Review(9, new Date(1496102400000L),"Diana");
        r.setId(1143);
        r.setMediaId(84);
        m.getReviews().add(r);

        media.add(m);
        m = new Media("Pride and Prejudice","BBC","Movie");
        m.setId(89);
        m.setSeason("");
        m.setEpisode("E5");
        r = new Review(10, new Date(1483833600000L),"Diana");
        r.setId(114);
        r.setMediaId(89);
        m.getReviews().add(r);

        r = new Review(10, new Date(1483833600000L),"Ben");
        r.setId(115);
        r.setMediaId(89);
        m.getReviews().add(r);

        media.add(m);
        m = new Media("Pride and Prejudice","BBC","Movie");
        m.setId(102);
        m.setSeason("");
        m.setEpisode("E6");
        r = new Review(10, new Date(1484006400000L),"Diana");
        r.setId(129);
        r.setMediaId(102);
        m.getReviews().add(r);

        r = new Review(8, new Date(1484006400000L),"Ben");
        r.setId(130);
        r.setMediaId(102);
        m.getReviews().add(r);

        media.add(m);
        m = new Media("Lord of the Rings (Extended)","New Line Cinema","Movie");
        m.setId(114);
        m.setSeason("M1 Fellowship of the Ring, The");
        m.setEpisode("P1");
        r = new Review(8, new Date(1484179200000L),"Diana");
        r.setId(142);
        r.setMediaId(114);
        m.getReviews().add(r);

        r = new Review(9, new Date(1484179200000L),"Ben");
        r.setId(143);
        r.setMediaId(114);
        m.getReviews().add(r);

        media.add(m);
        m = new Media("Lord of the Rings (Extended)","New Line Cinema","Movie");
        m.setId(209);
        m.setSeason("M1 Fellowship of the Ring, The");
        m.setEpisode("P2");
        r = new Review(10, new Date(1485907200000L),"Ben");
        r.setId(230);
        r.setMediaId(209);
        m.getReviews().add(r);

        r = new Review(8, new Date(1485907200000L),"Diana");
        r.setId(232);
        r.setMediaId(209);
        m.getReviews().add(r);

        media.add(m);
        m = new Media("Lord of the Rings (Extended)","New Line Cinema","Movie");
        m.setId(211);
        m.setSeason("M2 Two Towers, The");
        m.setEpisode("P1");
        r = new Review(9, new Date(1486080000000L),"Ben");
        r.setId(233);
        r.setMediaId(211);
        m.getReviews().add(r);

        r = new Review(9, new Date(1486080000000L),"Diana");
        r.setId(234);
        r.setMediaId(211);
        m.getReviews().add(r);

        media.add(m);
        m = new Media("Sherlock Holmes","Sir Arthur Conan Doyle","Book");
        m.setId(215);
        m.setSeason("");
        m.setEpisode("B21 Crooked Man, The");
        r = new Review(9, new Date(1486252800000L),"Ben");
        r.setId(238);
        r.setMediaId(215);
        m.getReviews().add(r);

        r = new Review(8, new Date(1491868800000L),"Diana");
        r.setId(697);
        r.setMediaId(215);
        m.getReviews().add(r);

        media.add(m);
        m = new Media("Lord of the Rings (Extended)","New Line Cinema","Movie");
        m.setId(216);
        m.setSeason("M2 Two Towers, The");
        m.setEpisode("P2");
        r = new Review(10, new Date(1486252800000L),"Diana");
        r.setId(239);
        r.setMediaId(216);
        m.getReviews().add(r);

        r = new Review(10, new Date(1486252800000L),"Ben");
        r.setId(240);
        r.setMediaId(216);
        m.getReviews().add(r);

        media.add(m);
        m = new Media("Sherlock Holmes","Sir Arthur Conan Doyle","Book");
        m.setId(221);
        m.setSeason("");
        m.setEpisode("B25 Final Problem, The");
        r = new Review(10, new Date(1489968000000L),"Ben");
        r.setId(543);
        r.setMediaId(221);
        m.getReviews().add(r);

        r = new Review(7, new Date(1492992000000L),"Diana");
        r.setId(767);
        r.setMediaId(221);
        m.getReviews().add(r);

        media.add(m);
        m = new Media("Lord of the Rings (Extended)","New Line Cinema","Movie");
        m.setId(234);
        m.setSeason("M3 Return of the King, The");
        m.setEpisode("P1");
        r = new Review(10, new Date(1486598400000L),"Diana");
        r.setId(255);
        r.setMediaId(234);
        m.getReviews().add(r);

        r = new Review(10, new Date(1486598400000L),"Ben");
        r.setId(256);
        r.setMediaId(234);
        m.getReviews().add(r);

        media.add(m);
        m = new Media("Lord of the Rings (Extended)","New Line Cinema","Movie");
        m.setId(236);
        m.setSeason("M3 Return of the King, The");
        m.setEpisode("P2");
        r = new Review(10, new Date(1486684800000L),"Ben");
        r.setId(258);
        r.setMediaId(236);
        m.getReviews().add(r);

        r = new Review(10, new Date(1486684800000L),"Diana");
        r.setId(260);
        r.setMediaId(236);
        m.getReviews().add(r);

        media.add(m);
        m = new Media("Myths and Legends","Jason Weiser","Podcast");
        m.setId(255);
        m.setSeason("");
        m.setEpisode("E60A Beowulf: I'm Kind of a Big Deal");
        r = new Review(9, new Date(1486944000000L),"Ben");
        r.setId(280);
        r.setMediaId(255);
        m.getReviews().add(r);

        r = new Review(10, new Date(1486944000000L),"Diana");
        r.setId(281);
        r.setMediaId(255);
        m.getReviews().add(r);

        media.add(m);
        m = new Media("Superhero Science","TED-Ed","YouTube");
        m.setId(266);
        m.setSeason("");
        m.setEpisode("E3 Flight");
        r = new Review(9, new Date(1487030400000L),"Ben");
        r.setId(292);
        r.setMediaId(266);
        m.getReviews().add(r);

        r = new Review(8, new Date(1487376000000L),"Diana");
        r.setId(344);
        r.setMediaId(266);
        m.getReviews().add(r);

        media.add(m);
        m = new Media("Captain America","Marvel","Movie");
        m.setId(273);
        m.setSeason("");
        m.setEpisode("M3 Civil War");
        r = new Review(10, new Date(1487116800000L),"Ben");
        r.setId(299);
        r.setMediaId(273);
        m.getReviews().add(r);

        r = new Review(8, new Date(1487116800000L),"Diana");
        r.setId(300);
        r.setMediaId(273);
        m.getReviews().add(r);

        media.add(m);
        m = new Media("Ant-Man","Marvel","Movie");
        m.setId(352);
        m.setSeason("");
        m.setEpisode("");
        r = new Review(8, new Date(1487980800000L),"Diana");
        r.setId(383);
        r.setMediaId(352);
        m.getReviews().add(r);

        r = new Review(9, new Date(1487980800000L),"Ben");
        r.setId(384);
        r.setMediaId(352);
        m.getReviews().add(r);

        media.add(m);
        m = new Media("Ask Pastor John","John Piper","Podcast");
        m.setId(407);
        m.setSeason("");
        m.setEpisode("E97 On Cussing");
        r = new Review(10, new Date(1488672000000L),"Diana");
        r.setId(451);
        r.setMediaId(407);
        m.getReviews().add(r);

        r = new Review(8, new Date(1488672000000L),"Ben");
        r.setId(452);
        r.setMediaId(407);
        m.getReviews().add(r);

        media.add(m);
        m = new Media("Ask Pastor John","John Piper","Podcast");
        m.setId(408);
        m.setSeason("");
        m.setEpisode("E640 What about Soft Cussing?");
        r = new Review(8, new Date(1488672000000L),"Ben");
        r.setId(453);
        r.setMediaId(408);
        m.getReviews().add(r);

        r = new Review(9, new Date(1488672000000L),"Diana");
        r.setId(454);
        r.setMediaId(408);
        m.getReviews().add(r);

        media.add(m);
        m = new Media("Anne of Green Gables","CBC","Movie");
        m.setId(478);
        m.setSeason("");
        m.setEpisode("P1");
        r = new Review(7, new Date(1489708800000L),"Ben");
        r.setId(525);
        r.setMediaId(478);
        m.getReviews().add(r);

        r = new Review(10, new Date(1489795200000L),"Diana");
        r.setId(534);
        r.setMediaId(478);
        m.getReviews().add(r);

        media.add(m);
        m = new Media("Evolutionary Hymn","C.S. Lewis","Poem");
        m.setId(480);
        m.setSeason("");
        m.setEpisode("");
        r = new Review(9, new Date(1489708800000L),"Ben");
        r.setId(527);
        r.setMediaId(480);
        m.getReviews().add(r);

        r = new Review(9, new Date(1489708800000L),"Diana");
        r.setId(528);
        r.setMediaId(480);
        m.getReviews().add(r);

        media.add(m);
        m = new Media("Tom's Language Files","Tom Scott","YouTube");
        m.setId(481);
        m.setSeason("");
        m.setEpisode("Fantastic Features We Don't Have In The English Language");
        r = new Review(9, new Date(1489708800000L),"Diana");
        r.setId(531);
        r.setMediaId(481);
        m.getReviews().add(r);

        r = new Review(9, new Date(1489708800000L),"Ben");
        r.setId(532);
        r.setMediaId(481);
        m.getReviews().add(r);

        media.add(m);
        m = new Media("Anne of Green Gables","CBC","Movie");
        m.setId(493);
        m.setSeason("");
        m.setEpisode("P2");
        r = new Review(10, new Date(1489968000000L),"Ben");
        r.setId(546);
        r.setMediaId(493);
        m.getReviews().add(r);

        r = new Review(10, new Date(1489968000000L),"Diana");
        r.setId(547);
        r.setMediaId(493);
        m.getReviews().add(r);

        media.add(m);
        m = new Media("Myths and Legends","Jason Weiser","Podcast");
        m.setId(507);
        m.setSeason("");
        m.setEpisode("E64 Frog Prince: Warts and All");
        r = new Review(10, new Date(1490313600000L),"Ben");
        r.setId(563);
        r.setMediaId(507);
        m.getReviews().add(r);

        r = new Review(10, new Date(1490313600000L),"Diana");
        r.setId(564);
        r.setMediaId(507);
        m.getReviews().add(r);

        media.add(m);
        m = new Media("Social Security Cards Explained","CGP Grey","YouTube");
        m.setId(530);
        m.setSeason("");
        m.setEpisode("");
        r = new Review(8, new Date(1490832000000L),"Ben");
        r.setId(591);
        r.setMediaId(530);
        m.getReviews().add(r);

        r = new Review(9, new Date(1490832000000L),"Diana");
        r.setId(599);
        r.setMediaId(530);
        m.getReviews().add(r);

        media.add(m);
        m = new Media("Sherlock Holmes","Sir Arthur Conan Doyle","Book");
        m.setId(535);
        m.setSeason("");
        m.setEpisode("B27 Norwood Builder, The");
        r = new Review(8, new Date(1490832000000L),"Ben");
        r.setId(596);
        r.setMediaId(535);
        m.getReviews().add(r);

        r = new Review(9, new Date(1493078400000L),"Diana");
        r.setId(781);
        r.setMediaId(535);
        m.getReviews().add(r);

        media.add(m);
        m = new Media("Avengers, The","Marvel","Movie");
        m.setId(570);
        m.setSeason("");
        m.setEpisode("M1");
        r = new Review(8, new Date(1491177600000L),"Ben");
        r.setId(638);
        r.setMediaId(570);
        m.getReviews().add(r);

        r = new Review(9, new Date(1491177600000L),"Diana");
        r.setId(639);
        r.setMediaId(570);
        m.getReviews().add(r);

        media.add(m);
        m = new Media("Captain America","Marvel","Movie");
        m.setId(583);
        m.setSeason("");
        m.setEpisode("M2 Winter Soldier, The");
        r = new Review(9, new Date(1491350400000L),"Ben");
        r.setId(652);
        r.setMediaId(583);
        m.getReviews().add(r);

        r = new Review(9, new Date(1491350400000L),"Diana");
        r.setId(653);
        r.setMediaId(583);
        m.getReviews().add(r);

        media.add(m);
        m = new Media("Sherlock Holmes","Sir Arthur Conan Doyle","Book");
        m.setId(585);
        m.setSeason("");
        m.setEpisode("B30 Priory School, The");
        r = new Review(8, new Date(1491436800000L),"Ben");
        r.setId(655);
        r.setMediaId(585);
        m.getReviews().add(r);

        r = new Review(10, new Date(1493251200000L),"Diana");
        r.setId(784);
        r.setMediaId(585);
        m.getReviews().add(r);

        media.add(m);
        m = new Media("Avengers, The","Marvel","Movie");
        m.setId(591);
        m.setSeason("");
        m.setEpisode("M2 Age of Ultron");
        r = new Review(10, new Date(1491523200000L),"Ben");
        r.setId(661);
        r.setMediaId(591);
        m.getReviews().add(r);

        r = new Review(7, new Date(1491523200000L),"Diana");
        r.setId(662);
        r.setMediaId(591);
        m.getReviews().add(r);

        media.add(m);
        m = new Media("Great Expectations","BBC","Movie");
        m.setId(599);
        m.setSeason("");
        m.setEpisode("P1");
        r = new Review(9, new Date(1491609600000L),"Ben");
        r.setId(672);
        r.setMediaId(599);
        m.getReviews().add(r);

        r = new Review(9, new Date(1491609600000L),"Diana");
        r.setId(673);
        r.setMediaId(599);
        m.getReviews().add(r);

        media.add(m);
        m = new Media("Great Expectations","BBC","Movie");
        m.setId(602);
        m.setSeason("");
        m.setEpisode("P3");
        r = new Review(9, new Date(1491696000000L),"Ben");
        r.setId(676);
        r.setMediaId(602);
        m.getReviews().add(r);

        r = new Review(8, new Date(1491696000000L),"Diana");
        r.setId(677);
        r.setMediaId(602);
        m.getReviews().add(r);

        media.add(m);
        m = new Media("Sherlock Holmes","Sir Arthur Conan Doyle","Book");
        m.setId(615);
        m.setSeason("");
        m.setEpisode("B32 Charles Augustus Milverton");
        r = new Review(10, new Date(1491868800000L),"Ben");
        r.setId(693);
        r.setMediaId(615);
        m.getReviews().add(r);

        r = new Review(8, new Date(1493164800000L),"Diana");
        r.setId(786);
        r.setMediaId(615);
        m.getReviews().add(r);

        media.add(m);
        m = new Media("Bleak House","BBC","Movie");
        m.setId(634);
        m.setSeason("");
        m.setEpisode("E6");
        r = new Review(8, new Date(1492300800000L),"Ben");
        r.setId(726);
        r.setMediaId(634);
        m.getReviews().add(r);

        r = new Review(9, new Date(1492300800000L),"Diana");
        r.setId(727);
        r.setMediaId(634);
        m.getReviews().add(r);

        media.add(m);
        m = new Media("Sherlock Holmes","Sir Arthur Conan Doyle","Book");
        m.setId(676);
        m.setSeason("");
        m.setEpisode("B39 Hound of the Baskervilles, The");
        r = new Review(10, new Date(1493251200000L),"Ben");
        r.setId(776);
        r.setMediaId(676);
        m.getReviews().add(r);

        r = new Review(9, new Date(1493856000000L),"Diana");
        r.setId(838);
        r.setMediaId(676);
        m.getReviews().add(r);

        media.add(m);
        m = new Media("Temple, The","George Herbert","Poem");
        m.setId(707);
        m.setSeason("");
        m.setEpisode("Love (III)");
        r = new Review(8, new Date(1493596800000L),"Ben");
        r.setId(823);
        r.setMediaId(707);
        m.getReviews().add(r);

        r = new Review(9, new Date(1493596800000L),"Diana");
        r.setId(824);
        r.setMediaId(707);
        m.getReviews().add(r);

        media.add(m);
        m = new Media("Bleak House","BBC","Movie");
        m.setId(727);
        m.setSeason("");
        m.setEpisode("E11");
        r = new Review(9, new Date(1494028800000L),"Ben");
        r.setId(853);
        r.setMediaId(727);
        m.getReviews().add(r);

        r = new Review(9, new Date(1494028800000L),"Diana");
        r.setId(854);
        r.setMediaId(727);
        m.getReviews().add(r);

        media.add(m);
        m = new Media("Bleak House","BBC","Movie");
        m.setId(728);
        m.setSeason("");
        m.setEpisode("E12");
        r = new Review(9, new Date(1494028800000L),"Ben");
        r.setId(855);
        r.setMediaId(728);
        m.getReviews().add(r);

        r = new Review(9, new Date(1494028800000L),"Diana");
        r.setId(856);
        r.setMediaId(728);
        m.getReviews().add(r);

        media.add(m);
        m = new Media("Bleak House","BBC","Movie");
        m.setId(729);
        m.setSeason("");
        m.setEpisode("E13");
        r = new Review(8, new Date(1494028800000L),"Ben");
        r.setId(857);
        r.setMediaId(729);
        m.getReviews().add(r);

        r = new Review(9, new Date(1494028800000L),"Diana");
        r.setId(858);
        r.setMediaId(729);
        m.getReviews().add(r);

        media.add(m);
        m = new Media("Bleak House","BBC","Movie");
        m.setId(733);
        m.setSeason("");
        m.setEpisode("E14");
        r = new Review(8, new Date(1494115200000L),"Diana");
        r.setId(863);
        r.setMediaId(733);
        m.getReviews().add(r);

        r = new Review(9, new Date(1494115200000L),"Ben");
        r.setId(864);
        r.setMediaId(733);
        m.getReviews().add(r);

        media.add(m);
        m = new Media("Bleak House","BBC","Movie");
        m.setId(734);
        m.setSeason("");
        m.setEpisode("E15");
        r = new Review(9, new Date(1494201600000L),"Ben");
        r.setId(865);
        r.setMediaId(734);
        m.getReviews().add(r);

        r = new Review(8, new Date(1494201600000L),"Diana");
        r.setId(1029);
        r.setMediaId(734);
        m.getReviews().add(r);

        media.add(m);
        m = new Media("Remarkable Way We Eat Pizza","Numberphile","YouTube");
        m.setId(756);
        m.setSeason("");
        m.setEpisode("");
        r = new Review(10, new Date(1494288000000L),"Ben");
        r.setId(888);
        r.setMediaId(756);
        m.getReviews().add(r);

        r = new Review(9, new Date(1494288000000L),"Diana");
        r.setId(896);
        r.setMediaId(756);
        m.getReviews().add(r);

        media.add(m);
        m = new Media("Sherlock Holmes","Sir Arthur Conan Doyle","Book");
        m.setId(790);
        m.setSeason("");
        m.setEpisode("B47 Devil's Foot, The");
        r = new Review(10, new Date(1494460800000L),"Diana");
        r.setId(916);
        r.setMediaId(790);
        m.getReviews().add(r);

        r = new Review(7, new Date(1496620800000L),"Ben");
        r.setId(1180);
        r.setMediaId(790);
        m.getReviews().add(r);

        media.add(m);
        m = new Media("Screwtape Letters, The","CS Lewis Doodle","YouTube");
        m.setId(793);
        m.setSeason("");
        m.setEpisode("C1");
        r = new Review(7, new Date(1494547200000L),"Ben");
        r.setId(920);
        r.setMediaId(793);
        m.getReviews().add(r);

        r = new Review(10, new Date(1494547200000L),"Diana");
        r.setId(921);
        r.setMediaId(793);
        m.getReviews().add(r);

        media.add(m);
        m = new Media("Temple, The","George Herbert","Poem");
        m.setId(805);
        m.setSeason("");
        m.setEpisode("Search, The");
        r = new Review(9, new Date(1494633600000L),"Ben");
        r.setId(936);
        r.setMediaId(805);
        m.getReviews().add(r);

        r = new Review(8, new Date(1494633600000L),"Diana");
        r.setId(937);
        r.setMediaId(805);
        m.getReviews().add(r);

        media.add(m);
        m = new Media("Seven Brides for Seven Brothers","Stanley Donen","Movie");
        m.setId(820);
        m.setSeason("");
        m.setEpisode("");
        r = new Review(8, new Date(1494806400000L),"Ben");
        r.setId(955);
        r.setMediaId(820);
        m.getReviews().add(r);

        r = new Review(10, new Date(1494806400000L),"Anastasia Strong");
        r.setId(975);
        r.setMediaId(820);
        m.getReviews().add(r);

        media.add(m);
        m = new Media("Anatomy & Physiology","CrashCourse","YouTube");
        m.setId(833);
        m.setSeason("");
        m.setEpisode("L2 Tissues, Part 1");
        r = new Review(9, new Date(1494892800000L),"Ben");
        r.setId(969);
        r.setMediaId(833);
        m.getReviews().add(r);

        r = new Review(8, new Date(1494892800000L),"Diana");
        r.setId(970);
        r.setMediaId(833);
        m.getReviews().add(r);

        media.add(m);
        m = new Media("Spirits in Bondage","C.S. Lewis","Poem");
        m.setId(885);
        m.setSeason("S1 Prison House, The");
        m.setEpisode("P3 Satyr, The");
        r = new Review(8, new Date(1495238400000L),"Ben");
        r.setId(1042);
        r.setMediaId(885);
        m.getReviews().add(r);

        r = new Review(9, new Date(1495238400000L),"Diana");
        r.setId(1043);
        r.setMediaId(885);
        m.getReviews().add(r);

        media.add(m);
        m = new Media("Jane Eyre","Masterpiece Theatre","Movie");
        m.setId(907);
        m.setSeason("");
        m.setEpisode("P1");
        r = new Review(9, new Date(1495411200000L),"Ben");
        r.setId(1063);
        r.setMediaId(907);
        m.getReviews().add(r);

        r = new Review(9, new Date(1495411200000L),"Diana");
        r.setId(1064);
        r.setMediaId(907);
        m.getReviews().add(r);

        media.add(m);
        m = new Media("Jane Eyre","Masterpiece Theatre","Movie");
        m.setId(918);
        m.setSeason("");
        m.setEpisode("P2");
        r = new Review(9, new Date(1495497600000L),"Ben");
        r.setId(1079);
        r.setMediaId(918);
        m.getReviews().add(r);

        r = new Review(9, new Date(1495497600000L),"Diana");
        r.setId(1080);
        r.setMediaId(918);
        m.getReviews().add(r);

        media.add(m);
        m = new Media("Newsies","Disney","Movie");
        m.setId(939);
        m.setSeason("");
        m.setEpisode("");
        r = new Review(10, new Date(1495756800000L),"Ben");
        r.setId(1108);
        r.setMediaId(939);
        m.getReviews().add(r);

        r = new Review(7, new Date(1495756800000L),"Diana");
        r.setId(1109);
        r.setMediaId(939);
        m.getReviews().add(r);

        media.add(m);
        m = new Media("Croods, The","DreamWorks","Movie");
        m.setId(951);
        m.setSeason("");
        m.setEpisode("");
        r = new Review(9, new Date(1495843200000L),"Ben");
        r.setId(1122);
        r.setMediaId(951);
        m.getReviews().add(r);

        r = new Review(10, new Date(1495843200000L),"Diana");
        r.setId(1123);
        r.setMediaId(951);
        m.getReviews().add(r);

        r = new Review(7, new Date(1495843200000L),"Anastasia Strong");
        r.setId(1129);
        r.setMediaId(951);
        m.getReviews().add(r);

        media.add(m);
        m = new Media("Anatomy & Physiology","CrashCourse","YouTube");
        m.setId(1004);
        m.setSeason("");
        m.setEpisode("L5 Tissues, Part 4");
        r = new Review(8, new Date(1496793600000L),"Ben");
        r.setId(1194);
        r.setMediaId(1004);
        m.getReviews().add(r);

        r = new Review(9, new Date(1496793600000L),"Diana");
        r.setId(1195);
        r.setMediaId(1004);
        m.getReviews().add(r);

        media.add(m);
        m = new Media("Sherlock Holmes","Sir Arthur Conan Doyle","Book");
        m.setId(1048);
        m.setSeason("");
        m.setEpisode("B53 Sussex Vampire, The");
        r = new Review(9, new Date(1497657600000L),"Ben");
        r.setId(1249);
        r.setMediaId(1048);
        m.getReviews().add(r);

        r = new Review(9, new Date(1494547200000L),"Diana");
        r.setId(1253);
        r.setMediaId(1048);
        m.getReviews().add(r);

        media.add(m);
        m = new Media("Great British Baking Show, The","BBC","TV Series");
        m.setId(1070);
        m.setSeason("S5");
        m.setEpisode("E9");
        r = new Review(8, new Date(1497916800000L),"Ben");
        r.setId(1274);
        r.setMediaId(1070);
        m.getReviews().add(r);

        r = new Review(9, new Date(1497916800000L),"Diana");
        r.setId(1275);
        r.setMediaId(1070);
        m.getReviews().add(r);

        media.add(m);
        m = new Media("When Satan Steals Your Motherhood","Christie Elkins","Article");
        m.setId(1080);
        m.setSeason("");
        m.setEpisode("");
        r = new Review(9, new Date(1498262400000L),"Diana");
        r.setId(1295);
        r.setMediaId(1080);
        m.getReviews().add(r);

        r = new Review(8, new Date(1498262400000L),"Ben");
        r.setId(1296);
        r.setMediaId(1080);
        m.getReviews().add(r);

        media.add(m);
        m = new Media("Avatar: The Last Airbender","Nickolodean","TV Series");
        m.setId(1181);
        m.setSeason("Book 1: Water");
        m.setEpisode("Chapter 10: Jet");
        r = new Review(9, new Date(1501286400000L),"Ben");
        r.setId(1441);
        r.setMediaId(1181);
        m.getReviews().add(r);

        r = new Review(9, new Date(1501286400000L),"Diana");
        r.setId(1443);
        r.setMediaId(1181);
        m.getReviews().add(r);

        media.add(m);
        m = new Media("Avatar: The Last Airbender","Nickolodean","TV Series");
        m.setId(1183);
        m.setSeason("Book 1: Water");
        m.setEpisode("Chapter 12: Storm, The");
        r = new Review(10, new Date(1501372800000L),"Ben");
        r.setId(1446);
        r.setMediaId(1183);
        m.getReviews().add(r);

        r = new Review(9, new Date(1501372800000L),"Diana");
        r.setId(1447);
        r.setMediaId(1183);
        m.getReviews().add(r);

        media.add(m);
        m = new Media("Wives & Daughters","BBC","Movie");
        m.setId(1187);
        m.setSeason("");
        m.setEpisode("P1");
        r = new Review(8, new Date(1501372800000L),"Ben");
        r.setId(1454);
        r.setMediaId(1187);
        m.getReviews().add(r);

        r = new Review(9, new Date(1501372800000L),"Diana");
        r.setId(1455);
        r.setMediaId(1187);
        m.getReviews().add(r);

        r = new Review(9, new Date(1501372800000L),"Hannah Parcher");
        r.setId(1456);
        r.setMediaId(1187);
        m.getReviews().add(r);

        media.add(m);
        m = new Media("Wives & Daughters","BBC","Movie");
        m.setId(1188);
        m.setSeason("");
        m.setEpisode("P2");
        r = new Review(7, new Date(1501372800000L),"Ben");
        r.setId(1457);
        r.setMediaId(1188);
        m.getReviews().add(r);

        r = new Review(9, new Date(1501372800000L),"Diana");
        r.setId(1458);
        r.setMediaId(1188);
        m.getReviews().add(r);

        r = new Review(9, new Date(1501372800000L),"Hannah Parcher");
        r.setId(1459);
        r.setMediaId(1188);
        m.getReviews().add(r);

        media.add(m);
        m = new Media("Avatar: The Last Airbender","Nickolodean","TV Series");
        m.setId(1208);
        m.setSeason("Book 1: Water");
        m.setEpisode("Chapter 20: Siege of the North P2");
        r = new Review(9, new Date(1502323200000L),"Ben");
        r.setId(1486);
        r.setMediaId(1208);
        m.getReviews().add(r);

        r = new Review(8, new Date(1502323200000L),"Diana");
        r.setId(1487);
        r.setMediaId(1208);
        m.getReviews().add(r);

        media.add(m);
        m = new Media("Screwtape Letters, The","CS Lewis Doodle","YouTube");
        m.setId(1212);
        m.setSeason("");
        m.setEpisode("C6");
        r = new Review(9, new Date(1502582400000L),"Ben");
        r.setId(1491);
        r.setMediaId(1212);
        m.getReviews().add(r);

        r = new Review(9, new Date(1502582400000L),"Diana");
        r.setId(1492);
        r.setMediaId(1212);
        m.getReviews().add(r);

        media.add(m);
        m = new Media("Avatar: The Last Airbender","Nickolodean","TV Series");
        m.setId(1216);
        m.setSeason("Book 2: Earth");
        m.setEpisode("Chapter 1: Avatar State, The");
        r = new Review(9, new Date(1502582400000L),"Ben");
        r.setId(1497);
        r.setMediaId(1216);
        m.getReviews().add(r);

        r = new Review(8, new Date(1502582400000L),"Diana");
        r.setId(1498);
        r.setMediaId(1216);
        m.getReviews().add(r);

        media.add(m);
        m = new Media("Ranger's Apprentice","John Flanagan","Book");
        m.setId(1230);
        m.setSeason("");
        m.setEpisode("B1 Ruins of Gorlan, The");
        r = new Review(9, new Date(1504915200000L),"Ben");
        r.setId(1515);
        r.setMediaId(1230);
        m.getReviews().add(r);

        r = new Review(8, new Date(1504915200000L),"Diana");
        r.setId(1516);
        r.setMediaId(1230);
        m.getReviews().add(r);

        media.add(m);
        m = new Media("Avatar: The Last Airbender","Nickolodean","TV Series");
        m.setId(1240);
        m.setSeason("Book 2: Earth");
        m.setEpisode("Chapter 7: Zuko Alone");
        r = new Review(9, new Date(1505433600000L),"Ben");
        r.setId(1530);
        r.setMediaId(1240);
        m.getReviews().add(r);

        r = new Review(9, new Date(1505433600000L),"Diana");
        r.setId(1531);
        r.setMediaId(1240);
        m.getReviews().add(r);

        media.add(m);
        m = new Media("Avatar: The Last Airbender","Nickolodean","TV Series");
        m.setId(1241);
        m.setSeason("Book 2: Earth");
        m.setEpisode("Chapter 8: Chase, The");
        r = new Review(10, new Date(1505606400000L),"Ben");
        r.setId(1532);
        r.setMediaId(1241);
        m.getReviews().add(r);

        r = new Review(9, new Date(1505606400000L),"Diana");
        r.setId(1533);
        r.setMediaId(1241);
        m.getReviews().add(r);

        media.add(m);
        m = new Media("Avatar: The Last Airbender","Nickolodean","TV Series");
        m.setId(1253);
        m.setSeason("Book 2: Earth");
        m.setEpisode("Chapter 12: Serpent's Pass, The");
        r = new Review(10, new Date(1506643200000L),"Ben");
        r.setId(1550);
        r.setMediaId(1253);
        m.getReviews().add(r);

        r = new Review(7, new Date(1506643200000L),"Diana");
        r.setId(1551);
        r.setMediaId(1253);
        m.getReviews().add(r);

        media.add(m);

        return media;
    }
}
