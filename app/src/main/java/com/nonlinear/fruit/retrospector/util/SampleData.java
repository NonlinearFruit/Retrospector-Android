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
        r.setReview("Probably my favorite eposide of the first 13 seasons. Really pulls on the heartstrings. Changes, twists, heartbreaking, heartmelting NCIS goodness.");
        m.getReviews().add(r);

        r = new Review(9, new Date(1480204800000L),"Diana");
        r.setId(2);
        r.setMediaId(1);
        r.setReview("#RipsYourHeartOutAndPutsItBack");
        m.getReviews().add(r);

        media.add(m);
        m = new Media("Sense and Sensibility","BBC","Movie");
        m.setId(11);
        m.setSeason("");
        m.setEpisode("E2");
        r = new Review(10, new Date(1480636800000L),"Diana");
        r.setId(14);
        r.setMediaId(11);
        r.setReview("");
        m.getReviews().add(r);

        r = new Review(7, new Date(1480636800000L),"Ben");
        r.setId(15);
        r.setMediaId(11);
        r.setReview("The plot thickens. Still most completely focused on love interests (because nothing else ever happened in the 1800's?). But Willabie is a jerk and Edward is engaged to a catty lady so that is interesting.");
        m.getReviews().add(r);

        media.add(m);
        m = new Media("Sense and Sensibility","BBC","Movie");
        m.setId(12);
        m.setSeason("");
        m.setEpisode("E3");
        r = new Review(10, new Date(1480636800000L),"Diana");
        r.setId(16);
        r.setMediaId(12);
        r.setReview("");
        m.getReviews().add(r);

        r = new Review(9, new Date(1480636800000L),"Ben");
        r.setId(17);
        r.setMediaId(12);
        r.setReview("Quite the Happily Ever After. This episode had a couple twists and some action, which was welcomed.");
        m.getReviews().add(r);

        media.add(m);
        m = new Media("Emma","BBC","Movie");
        m.setId(17);
        m.setSeason("");
        m.setEpisode("E1");
        r = new Review(8, new Date(1480896000000L),"Ben");
        r.setId(20);
        r.setMediaId(17);
        r.setReview("Great job introducing and fleshing out characters. A lot of romance brewing but none if the lovey-dovey drama, so that is in its favor. I found ths episode interesting but over all the plot was somewhat lacking. A lot of time past, and events took place but the plot held still. Also, I've seen this twice already and am still noticing new things. A lot of minor detail that adds depth.");
        m.getReviews().add(r);

        r = new Review(9, new Date(1480896000000L),"Diana");
        r.setId(21);
        r.setMediaId(17);
        r.setReview("Good job introducing characters and good start to the story. Makes it easy for n00bs to follow what is happening.");
        m.getReviews().add(r);

        media.add(m);
        m = new Media("Emma","BBC","Movie");
        m.setId(18);
        m.setSeason("");
        m.setEpisode("E2");
        r = new Review(9, new Date(1480982400000L),"Ben");
        r.setId(22);
        r.setMediaId(18);
        r.setReview("Was a lot more active and interesting. Characters and the plot progressed.");
        m.getReviews().add(r);

        r = new Review(10, new Date(1480982400000L),"Diana");
        r.setId(23);
        r.setMediaId(18);
        r.setReview("Favorite scene is when Mr Elton proposes!");
        m.getReviews().add(r);

        media.add(m);
        m = new Media("Emma","BBC","Movie");
        m.setId(20);
        m.setSeason("");
        m.setEpisode("E4");
        r = new Review(8, new Date(1480982400000L),"Ben");
        r.setId(26);
        r.setMediaId(20);
        r.setReview("Mushy-gushy");
        m.getReviews().add(r);

        r = new Review(9, new Date(1480982400000L),"Diana");
        r.setId(27);
        r.setMediaId(20);
        r.setReview("I would have liked more details on some things.");
        m.getReviews().add(r);

        media.add(m);
        m = new Media("Sherlock Holmes","Sir Arthur Conan Doyle","Book");
        m.setId(38);
        m.setSeason("");
        m.setEpisode("B8 Man with the Twisted Lip, The");
        r = new Review(9, new Date(1481673600000L),"Ben");
        r.setId(49);
        r.setMediaId(38);
        r.setReview("Should have seen it was the homeless man but I missed it until the end.");
        m.getReviews().add(r);

        r = new Review(9, new Date(1491868800000L),"Diana");
        r.setId(690);
        r.setMediaId(38);
        r.setReview("");
        m.getReviews().add(r);

        media.add(m);
        m = new Media("Sherlock Holmes","Sir Arthur Conan Doyle","Book");
        m.setId(41);
        m.setSeason("");
        m.setEpisode("B10 Speckled Band, The");
        r = new Review(8, new Date(1481760000000L),"Ben");
        r.setId(53);
        r.setMediaId(41);
        r.setReview("The Damsel in Distress trope is a particular favorite of mine and I think this one was well done. ");
        m.getReviews().add(r);

        r = new Review(9, new Date(1491868800000L),"Diana");
        r.setId(699);
        r.setMediaId(41);
        r.setReview("");
        m.getReviews().add(r);

        media.add(m);
        m = new Media("Death, be not proud","John Donne","Poem");
        m.setId(47);
        m.setSeason("");
        m.setEpisode("");
        r = new Review(9, new Date(1482019200000L),"Ben");
        r.setId(56);
        r.setMediaId(47);
        r.setReview("It felt a little rocky with a line or two (eg 'And poppy or charms can make us sleep as well'). Also had a hard time with the rhythm (-1). But overall, loved the content; very thought provoking.");
        m.getReviews().add(r);

        r = new Review(8, new Date(1482019200000L),"Diana");
        r.setId(57);
        r.setMediaId(47);
        r.setReview("Really like the content and attitude. The rhythm and punctuation were hard to get a hold of.");
        m.getReviews().add(r);

        media.add(m);
        m = new Media("Walking With God","William Cowper","Poem");
        m.setId(74);
        m.setSeason("");
        m.setEpisode("");
        r = new Review(10, new Date(1483488000000L),"Ben");
        r.setId(94);
        r.setMediaId(74);
        r.setReview("I really like this one. Great rhymning, great meaning, short, straight forward, encouraging. I also really like the theme of this one, I can highly empathize with being on the rocks with God and desiring to be closer.\n\n'''\nThe dearest idol I have known, \n     Whate'er that idol be; \nHelp me to tear it from thy throne, \n     And worship only thee.\n'''");
        m.getReviews().add(r);

        r = new Review(8, new Date(1489708800000L),"Diana");
        r.setId(530);
        r.setMediaId(74);
        r.setReview("");
        m.getReviews().add(r);

        media.add(m);
        m = new Media("Pride and Prejudice","BBC","Movie");
        m.setId(77);
        m.setSeason("");
        m.setEpisode("E1");
        r = new Review(10, new Date(1483660800000L),"Diana");
        r.setId(98);
        r.setMediaId(77);
        r.setReview("I love it. Its perfect, brilliant, marvelous! The characters are great, everything is great.");
        m.getReviews().add(r);

        r = new Review(10, new Date(1483660800000L),"Ben");
        r.setId(99);
        r.setMediaId(77);
        r.setReview("Very well done. I really enjoy the protaganists. Even after seeing this movie so many times, I still love it. There is a lot going on and that adds a lot to the plot. The character motives and development were well established in the first episode.\n\nPerformance: 10\nPlot: 10\nCharacters: 10\nCleverness: 8");
        m.getReviews().add(r);

        media.add(m);
        m = new Media("Pride and Prejudice","BBC","Movie");
        m.setId(80);
        m.setSeason("");
        m.setEpisode("E2");
        r = new Review(9, new Date(1483747200000L),"Ben");
        r.setId(102);
        r.setMediaId(80);
        r.setReview("Not as good as the first but very good.\n\nPerformance: 10\nPlot: 9\nCharacters: 10\nCleverness: 8");
        m.getReviews().add(r);

        r = new Review(10, new Date(1483747200000L),"Diana");
        r.setId(103);
        r.setMediaId(80);
        r.setReview("The plot is progressed and you get to know the characters better.");
        m.getReviews().add(r);

        media.add(m);
        m = new Media("Pride and Prejudice","BBC","Movie");
        m.setId(82);
        m.setSeason("");
        m.setEpisode("E3");
        r = new Review(10, new Date(1483747200000L),"Ben");
        r.setId(105);
        r.setMediaId(82);
        r.setReview("Really enjoying this mini even though it isn't very clever, I like the dialog and characters.");
        m.getReviews().add(r);

        r = new Review(10, new Date(1483747200000L),"Diana");
        r.setId(106);
        r.setMediaId(82);
        r.setReview("");
        m.getReviews().add(r);

        media.add(m);
        m = new Media("Pride and Prejudice","BBC","Movie");
        m.setId(83);
        m.setSeason("");
        m.setEpisode("E4");
        r = new Review(10, new Date(1483747200000L),"Ben");
        r.setId(107);
        r.setMediaId(83);
        r.setReview("It is amazing how many times I've seen this and am still noticing new things.");
        m.getReviews().add(r);

        r = new Review(10, new Date(1483747200000L),"Diana");
        r.setId(108);
        r.setMediaId(83);
        r.setReview("");
        m.getReviews().add(r);

        media.add(m);
        m = new Media("Exhortation to Prayer","William Cowper","Poem");
        m.setId(84);
        m.setSeason("");
        m.setEpisode("");
        r = new Review(10, new Date(1483747200000L),"Ben");
        r.setId(109);
        r.setMediaId(84);
        r.setReview("This speaks directly to every Christian's struggle with prayer and I love it. Practical poetry that is very encouraging.\n\n'''\nAnd Satan trembles, when he sees \nThe weakest saint upon his knees.\n'''");
        m.getReviews().add(r);

        r = new Review(9, new Date(1496102400000L),"Diana");
        r.setId(1143);
        r.setMediaId(84);
        r.setReview("");
        m.getReviews().add(r);

        media.add(m);
        m = new Media("Pride and Prejudice","BBC","Movie");
        m.setId(89);
        m.setSeason("");
        m.setEpisode("E5");
        r = new Review(10, new Date(1483833600000L),"Diana");
        r.setId(114);
        r.setMediaId(89);
        r.setReview("");
        m.getReviews().add(r);

        r = new Review(10, new Date(1483833600000L),"Ben");
        r.setId(115);
        r.setMediaId(89);
        r.setReview("I loved Darcy and Liz. They are both so kind hearted. The plot was intruiging and the every character is so well developed.\n\nI particularly loved Darcy's conduct towards Liz, very sweet.\n\nPerformance: 10\nPlot: 10\nCharacters: 10\nCleverness: 8");
        m.getReviews().add(r);

        media.add(m);
        m = new Media("Pride and Prejudice","BBC","Movie");
        m.setId(102);
        m.setSeason("");
        m.setEpisode("E6");
        r = new Review(10, new Date(1484006400000L),"Diana");
        r.setId(129);
        r.setMediaId(102);
        r.setReview("");
        m.getReviews().add(r);

        r = new Review(8, new Date(1484006400000L),"Ben");
        r.setId(130);
        r.setMediaId(102);
        r.setReview("I really enjoyed it but it wasn't my favorite.\n\nPerformance: 10\nPlot: 7\nCharacters: 7\nCleverness: 7");
        m.getReviews().add(r);

        media.add(m);
        m = new Media("Lord of the Rings (Extended)","New Line Cinema","Movie");
        m.setId(114);
        m.setSeason("M1 Fellowship of the Ring, The");
        m.setEpisode("P1");
        r = new Review(8, new Date(1484179200000L),"Diana");
        r.setId(142);
        r.setMediaId(114);
        r.setReview("Missing characters, but they can't do the entire book.");
        m.getReviews().add(r);

        r = new Review(9, new Date(1484179200000L),"Ben");
        r.setId(143);
        r.setMediaId(114);
        r.setReview("Really love the characters (especially Pip and Merry). The story is awesome. Very well done. Every film should be a miniseries with extended editions.\n\nPerformance: 10\nPlot: 10\nCharacters: 9\nCleverness: 7\n");
        m.getReviews().add(r);

        media.add(m);
        m = new Media("Lord of the Rings (Extended)","New Line Cinema","Movie");
        m.setId(209);
        m.setSeason("M1 Fellowship of the Ring, The");
        m.setEpisode("P2");
        r = new Review(10, new Date(1485907200000L),"Ben");
        r.setId(230);
        r.setMediaId(209);
        r.setReview("Performance: 9\nLoved it!\n\nPlot: 10\nSuperb!\n\nCharacters: 10\nI love Pippin and Took and Aragon and Sam and Legaloss and Gimli. I do wish their was more detail on the relationship between the hobbits prior to this adventure. Why are they so loyal to each other?\n\nCleverness: 9");
        m.getReviews().add(r);

        r = new Review(8, new Date(1485907200000L),"Diana");
        r.setId(232);
        r.setMediaId(209);
        r.setReview("");
        m.getReviews().add(r);

        media.add(m);
        m = new Media("Lord of the Rings (Extended)","New Line Cinema","Movie");
        m.setId(211);
        m.setSeason("M2 Two Towers, The");
        m.setEpisode("P1");
        r = new Review(9, new Date(1486080000000L),"Ben");
        r.setId(233);
        r.setMediaId(211);
        r.setReview("\nPerformance: 9\n\nPlot: 10\n\nCharacters: 9\nLacked character development with a lot of people introduced here, but also did a good job with others.\n\nCleverness: 8");
        m.getReviews().add(r);

        r = new Review(9, new Date(1486080000000L),"Diana");
        r.setId(234);
        r.setMediaId(211);
        r.setReview("");
        m.getReviews().add(r);

        media.add(m);
        m = new Media("Sherlock Holmes","Sir Arthur Conan Doyle","Book");
        m.setId(215);
        m.setSeason("");
        m.setEpisode("B21 Crooked Man, The");
        r = new Review(9, new Date(1486252800000L),"Ben");
        r.setId(238);
        r.setMediaId(215);
        r.setReview("Plot: 9\n\nCharacters: 9\nNever very many characters but I liked the crooked man.\n\nCleverness: 9\nMakes sense");
        m.getReviews().add(r);

        r = new Review(8, new Date(1491868800000L),"Diana");
        r.setId(697);
        r.setMediaId(215);
        r.setReview("");
        m.getReviews().add(r);

        media.add(m);
        m = new Media("Lord of the Rings (Extended)","New Line Cinema","Movie");
        m.setId(216);
        m.setSeason("M2 Two Towers, The");
        m.setEpisode("P2");
        r = new Review(10, new Date(1486252800000L),"Diana");
        r.setId(239);
        r.setMediaId(216);
        r.setReview("");
        m.getReviews().add(r);

        r = new Review(10, new Date(1486252800000L),"Ben");
        r.setId(240);
        r.setMediaId(216);
        r.setReview("The conflict and motivation of Gollum is much more apparent to me now. Very similar to Kreacher.\n\nPerformance: 10\n\nPlot: 10\n\nCharacters: 10\n11 if I could! Loved the fellowship and development of Treebeard and other protagonists. Wish we could have seen more on the evil side and what they are up to.\n\nCleverness: 9\nI loved it. Very well done. Multi-threaded. But not quite a 10.");
        m.getReviews().add(r);

        media.add(m);
        m = new Media("Sherlock Holmes","Sir Arthur Conan Doyle","Book");
        m.setId(221);
        m.setSeason("");
        m.setEpisode("B25 Final Problem, The");
        r = new Review(10, new Date(1489968000000L),"Ben");
        r.setId(543);
        r.setMediaId(221);
        r.setReview("First (and last?) appearance of James Moriarty!\n\nPerformance: 10\n\nPlot: 10\n\nCharacters: 10\n\nCleverness: 10");
        m.getReviews().add(r);

        r = new Review(7, new Date(1492992000000L),"Diana");
        r.setId(767);
        r.setMediaId(221);
        r.setReview("");
        m.getReviews().add(r);

        media.add(m);
        m = new Media("Lord of the Rings (Extended)","New Line Cinema","Movie");
        m.setId(234);
        m.setSeason("M3 Return of the King, The");
        m.setEpisode("P1");
        r = new Review(10, new Date(1486598400000L),"Diana");
        r.setId(255);
        r.setMediaId(234);
        r.setReview("");
        m.getReviews().add(r);

        r = new Review(10, new Date(1486598400000L),"Ben");
        r.setId(256);
        r.setMediaId(234);
        r.setReview("Performance: 10\n\nPlot: 10\n\nCharacters: 10\nExcellent job on developing characters\n\nCleverness: 10");
        m.getReviews().add(r);

        media.add(m);
        m = new Media("Lord of the Rings (Extended)","New Line Cinema","Movie");
        m.setId(236);
        m.setSeason("M3 Return of the King, The");
        m.setEpisode("P2");
        r = new Review(10, new Date(1486684800000L),"Ben");
        r.setId(258);
        r.setMediaId(236);
        r.setReview("Loved all of it!\n\nPerformance: 10\n\nPlot: 10\n\nCharacters: 10\n\nCleverness: 10");
        m.getReviews().add(r);

        r = new Review(10, new Date(1486684800000L),"Diana");
        r.setId(260);
        r.setMediaId(236);
        r.setReview("");
        m.getReviews().add(r);

        media.add(m);
        m = new Media("Myths and Legends","Jason Weiser","Podcast");
        m.setId(255);
        m.setSeason("");
        m.setEpisode("E60A Beowulf: I'm Kind of a Big Deal");
        r = new Review(9, new Date(1486944000000L),"Ben");
        r.setId(280);
        r.setMediaId(255);
        r.setReview("Performance: 10\n\nPlot: 9\n\nCharacters: 8\n\nCleverness: 8");
        m.getReviews().add(r);

        r = new Review(10, new Date(1486944000000L),"Diana");
        r.setId(281);
        r.setMediaId(255);
        r.setReview("");
        m.getReviews().add(r);

        media.add(m);
        m = new Media("Superhero Science","TED-Ed","YouTube");
        m.setId(266);
        m.setSeason("");
        m.setEpisode("E3 Flight");
        r = new Review(9, new Date(1487030400000L),"Ben");
        r.setId(292);
        r.setMediaId(266);
        r.setReview("Performance: 8\n\nContent: 9\n\nCleverness: 9");
        m.getReviews().add(r);

        r = new Review(8, new Date(1487376000000L),"Diana");
        r.setId(344);
        r.setMediaId(266);
        r.setReview("");
        m.getReviews().add(r);

        media.add(m);
        m = new Media("Captain America","Marvel","Movie");
        m.setId(273);
        m.setSeason("");
        m.setEpisode("M3 Civil War");
        r = new Review(10, new Date(1487116800000L),"Ben");
        r.setId(299);
        r.setMediaId(273);
        r.setReview("Had an unfortunately high saturation of language.\n\nPerformance: 10\n\nPlot: 10\n\nCharacters: 10\nIntroduce 2 new superheros + like 8 other supers and still have 3D development? 10\n\nCleverness: 10\nI didn't realize how planned out the bad dude was. Everything that happened was completely intentional.");
        m.getReviews().add(r);

        r = new Review(8, new Date(1487116800000L),"Diana");
        r.setId(300);
        r.setMediaId(273);
        r.setReview("Language is really my only complaint.");
        m.getReviews().add(r);

        media.add(m);
        m = new Media("Ant-Man","Marvel","Movie");
        m.setId(352);
        m.setSeason("");
        m.setEpisode("");
        r = new Review(8, new Date(1487980800000L),"Diana");
        r.setId(383);
        r.setMediaId(352);
        r.setReview("Story: 10\n\nLanguage: -2\nFrequent mild language, a raunch comment, and miss using the Lords name\n\nAlso didn't like how causual the relationship wth the mom and fiance.\n");
        m.getReviews().add(r);

        r = new Review(9, new Date(1487980800000L),"Ben");
        r.setId(384);
        r.setMediaId(352);
        r.setReview("Bad Stuff: 0\nBad language (but not severe), a sexual reference, and general casualness with sin (living together, breaking the law, etc).\n\nPerformance: 9\nGreat!\n\nPlot: 9\nI thought the plot was pretty good for a Marvel movie. It had a real bad guy, sorta... at least for the last 10 minutes.\n\nCharacters: 10\nI loved all the characters! It was hilaruous. The Hydra involvement bit was a little left field... Maybe in the earlier movies the guy on the board with Stark was associated with Hydra? \n\nCleverness: 7\nNothing super clever, but still a lot of cool deep references that bring the past to life. A second viewing could bring a lot of that stuff out.");
        m.getReviews().add(r);

        media.add(m);
        m = new Media("Ask Pastor John","John Piper","Podcast");
        m.setId(407);
        m.setSeason("");
        m.setEpisode("E97 On Cussing");
        r = new Review(10, new Date(1488672000000L),"Diana");
        r.setId(451);
        r.setMediaId(407);
        r.setReview("Very good. A great bibical case for not cussing.");
        m.getReviews().add(r);

        r = new Review(8, new Date(1488672000000L),"Ben");
        r.setId(452);
        r.setMediaId(407);
        r.setReview("Presentation: 7\n\nContent: 9\nVery helpful and timely for the weights on my heart. Extremely greatful for the bibilcal perspective.\n\nCleverness: 8");
        m.getReviews().add(r);

        media.add(m);
        m = new Media("Ask Pastor John","John Piper","Podcast");
        m.setId(408);
        m.setSeason("");
        m.setEpisode("E640 What about Soft Cussing?");
        r = new Review(8, new Date(1488672000000L),"Ben");
        r.setId(453);
        r.setMediaId(408);
        r.setReview(" 1 Corinthians 14:20 'Be infants in evil'\n\nPresentation: 7\n\nContent: 9\nHelpful and biblical\n\nCleverness: 7");
        m.getReviews().add(r);

        r = new Review(9, new Date(1488672000000L),"Diana");
        r.setId(454);
        r.setMediaId(408);
        r.setReview("");
        m.getReviews().add(r);

        media.add(m);
        m = new Media("Anne of Green Gables","CBC","Movie");
        m.setId(478);
        m.setSeason("");
        m.setEpisode("P1");
        r = new Review(7, new Date(1489708800000L),"Ben");
        r.setId(525);
        r.setMediaId(478);
        r.setReview("Performance: 8\n\nPlot: 6\n\nCharacters: 8\n\nCleverness: 6");
        m.getReviews().add(r);

        r = new Review(10, new Date(1489795200000L),"Diana");
        r.setId(534);
        r.setMediaId(478);
        r.setReview("");
        m.getReviews().add(r);

        media.add(m);
        m = new Media("Evolutionary Hymn","C.S. Lewis","Poem");
        m.setId(480);
        m.setSeason("");
        m.setEpisode("");
        r = new Review(9, new Date(1489708800000L),"Ben");
        r.setId(527);
        r.setMediaId(480);
        r.setReview("Structure: 8\n\nContent: 8\n\nMeaning: 9\n\nCleverness: 9");
        m.getReviews().add(r);

        r = new Review(9, new Date(1489708800000L),"Diana");
        r.setId(528);
        r.setMediaId(480);
        r.setReview("");
        m.getReviews().add(r);

        media.add(m);
        m = new Media("Tom's Language Files","Tom Scott","YouTube");
        m.setId(481);
        m.setSeason("");
        m.setEpisode("Fantastic Features We Don't Have In The English Language");
        r = new Review(9, new Date(1489708800000L),"Diana");
        r.setId(531);
        r.setMediaId(481);
        r.setReview("");
        m.getReviews().add(r);

        r = new Review(9, new Date(1489708800000L),"Ben");
        r.setId(532);
        r.setMediaId(481);
        r.setReview("Performance: 8\n\nContent: 10\n\nCleverness: 9");
        m.getReviews().add(r);

        media.add(m);
        m = new Media("Anne of Green Gables","CBC","Movie");
        m.setId(493);
        m.setSeason("");
        m.setEpisode("P2");
        r = new Review(10, new Date(1489968000000L),"Ben");
        r.setId(546);
        r.setMediaId(493);
        r.setReview("Performance: 10\n\nPlot: 10\n\nCharacters: 10\n\nCleverness: 9");
        m.getReviews().add(r);

        r = new Review(10, new Date(1489968000000L),"Diana");
        r.setId(547);
        r.setMediaId(493);
        r.setReview("");
        m.getReviews().add(r);

        media.add(m);
        m = new Media("Myths and Legends","Jason Weiser","Podcast");
        m.setId(507);
        m.setSeason("");
        m.setEpisode("E64 Frog Prince: Warts and All");
        r = new Review(10, new Date(1490313600000L),"Ben");
        r.setId(563);
        r.setMediaId(507);
        r.setReview("");
        m.getReviews().add(r);

        r = new Review(10, new Date(1490313600000L),"Diana");
        r.setId(564);
        r.setMediaId(507);
        r.setReview("");
        m.getReviews().add(r);

        media.add(m);
        m = new Media("Social Security Cards Explained","CGP Grey","YouTube");
        m.setId(530);
        m.setSeason("");
        m.setEpisode("");
        r = new Review(8, new Date(1490832000000L),"Ben");
        r.setId(591);
        r.setMediaId(530);
        r.setReview("Performance: 8\n\nContent: 9\n\nCleverness: 8");
        m.getReviews().add(r);

        r = new Review(9, new Date(1490832000000L),"Diana");
        r.setId(599);
        r.setMediaId(530);
        r.setReview("");
        m.getReviews().add(r);

        media.add(m);
        m = new Media("Sherlock Holmes","Sir Arthur Conan Doyle","Book");
        m.setId(535);
        m.setSeason("");
        m.setEpisode("B27 Norwood Builder, The");
        r = new Review(8, new Date(1490832000000L),"Ben");
        r.setId(596);
        r.setMediaId(535);
        r.setReview("Presentation: 8\n\nPlot: 9\n\nCharacters: 8\n\nCleverness: 8");
        m.getReviews().add(r);

        r = new Review(9, new Date(1493078400000L),"Diana");
        r.setId(781);
        r.setMediaId(535);
        r.setReview("");
        m.getReviews().add(r);

        media.add(m);
        m = new Media("Avengers, The","Marvel","Movie");
        m.setId(570);
        m.setSeason("");
        m.setEpisode("M1");
        r = new Review(8, new Date(1491177600000L),"Ben");
        r.setId(638);
        r.setMediaId(570);
        r.setReview("I understood a lot more this time, but I also wasn't quite as impressed as I was previously. The plot was meh and a lot of the jokes weren't as funny.\n\nGood Stuff:\nSelf-sacrifice, defending others is protrayed as good.\n\nBad Stuff:\nLanguage all over.\n\nPerformance: 8\n\nPlot: 7\n\nCharacters: 9\n\nCleverness: 7");
        m.getReviews().add(r);

        r = new Review(9, new Date(1491177600000L),"Diana");
        r.setId(639);
        r.setMediaId(570);
        r.setReview("");
        m.getReviews().add(r);

        media.add(m);
        m = new Media("Captain America","Marvel","Movie");
        m.setId(583);
        m.setSeason("");
        m.setEpisode("M2 Winter Soldier, The");
        r = new Review(9, new Date(1491350400000L),"Ben");
        r.setId(652);
        r.setMediaId(583);
        r.setReview("Good stuff:\nSelf sacrifice was huge. When Cap reviled that SHIELD was Hydra. A lot of agents died doing the right thing. Friendship was also big. Cap and Bucky + Cap and Falcon.\n\nBad stuff:\nA lot of violence and death. Less than some of the other movies, but still a lot on camera. Innocent people were murdered and it is hard not to think about their families and lives. No remorse for killing/death/murder and little value on people's lives.\n\nPerformance: 9\n\nPlot: 9\n\nCharacters: 10\n\nCleverness: 8");
        m.getReviews().add(r);

        r = new Review(9, new Date(1491350400000L),"Diana");
        r.setId(653);
        r.setMediaId(583);
        r.setReview("");
        m.getReviews().add(r);

        media.add(m);
        m = new Media("Sherlock Holmes","Sir Arthur Conan Doyle","Book");
        m.setId(585);
        m.setSeason("");
        m.setEpisode("B30 Priory School, The");
        r = new Review(8, new Date(1491436800000L),"Ben");
        r.setId(655);
        r.setMediaId(585);
        r.setReview("I loved how Holmes repremanded the father and gave him marriage advice at the end. +1\n\nPresentation: 6\n\nPlot: 7\nIt was simple-ish and fun to try to deduce\n\nCharacters: 7\nReally disliked the bad guys and I admired the german master\n\nCleverness: 6\nI felt like it was kinda obvious, the jist of what had happened");
        m.getReviews().add(r);

        r = new Review(10, new Date(1493251200000L),"Diana");
        r.setId(784);
        r.setMediaId(585);
        r.setReview("");
        m.getReviews().add(r);

        media.add(m);
        m = new Media("Avengers, The","Marvel","Movie");
        m.setId(591);
        m.setSeason("");
        m.setEpisode("M2 Age of Ultron");
        r = new Review(10, new Date(1491523200000L),"Ben");
        r.setId(661);
        r.setMediaId(591);
        r.setReview("Good Stuff:\nSacrifice. Pedro died to say Hawkeye, who was risking his life to save a kid. Family, Hawkeye has a family and he loves them and he doesn't lie to them. He loves his wife and it is viewed as a good thing, a safe haven. Children are viewed as important ('more important than the mission'). Black Widow's past reviles that. The value of human life. The Avengers were actively trying to reduce casualties in this movie. There was remorse (on the Hulk's part) over killing and Vision doesn't desire to end life. The Hulk's attitude towards his ability is half-good. He doesn't want to destroy or kill. But he fears his power and separates himself from it ('the other guy'). I think there is wisdom in restraint but without harnessing his powers, he is even more dangerous.\n\nBad Stuff:\nLanguage, I didn't like how Cap handled the jabs and language was a problem. Violence and some graphic-ness with it. Sexual innuendo.\n\nVision:\nI don't think Vision was blasphemous. He doesn't make 'god-like' claims (unlike Ultron). The 'I am' statement was declaring that he exists and is not a clone ('I am not Jarvis, I am not Ultron.... I.. am...'). I think 'Congnito ergo sum' is a much closer interpretation. At the end, he doesn't say that humans are good. He says that they are trying (in vain) to controll chaos and they are beautful even though they are temporary and will destroy themselves. 'It is a privelage to be among them.' I think this highlights the fact that even though Vision is 'more perfect', there is something special about humans. That something is the fact that they are made in God's image.\n\nUltron:\nUltron has a  god-delusion about himself. He uses a lot of biblical language and does a good job at being the villian. He has a Satan-like usage of Scripture and I think they makes him more evil (and he is portrayed that way).\n\nPerformance: 9\n\nPlot: 8\n\nCharacters: 10\n\nCleverness: 10");
        m.getReviews().add(r);

        r = new Review(7, new Date(1491523200000L),"Diana");
        r.setId(662);
        r.setMediaId(591);
        r.setReview("Suggestive content, language and Cap using language wasn't a fan. Casualty about sexuality.\n\nThe representation of family and how important they are. Clint loves his wife and his children and they aren't in the dark. It was heart breaking what they did to Black Widow, but that children matter and that they are worth risking for. \n\nUltron was a very evil villian. Misquoting Scripture. Sort of like what Satan does. He was an exceptional villian. He believed he was in the right.\n\nThey did a good job developing characters. The importance of communication. Keeping secrets can hurt each other. The point of the Avengers is so that we don't have to keep doing this. An honorable but impossible goal. The sacrifice was very real. Hawkeye has a lot to lose. \n\nI really liked Vision's character. The 'I am' statement didn't sound like a god statement. He doesn't say mankind was good. He said it was a privelege to be among them. It makes sense because humans are made in the image of God. Vision valued human life over AI life.");
        m.getReviews().add(r);

        media.add(m);
        m = new Media("Great Expectations","BBC","Movie");
        m.setId(599);
        m.setSeason("");
        m.setEpisode("P1");
        r = new Review(9, new Date(1491609600000L),"Ben");
        r.setId(672);
        r.setMediaId(599);
        r.setReview("Performance: 9\n\nPlot: 9\n\nCharacters: 10\n\nCleverness: 8");
        m.getReviews().add(r);

        r = new Review(9, new Date(1491609600000L),"Diana");
        r.setId(673);
        r.setMediaId(599);
        r.setReview("");
        m.getReviews().add(r);

        media.add(m);
        m = new Media("Great Expectations","BBC","Movie");
        m.setId(602);
        m.setSeason("");
        m.setEpisode("P3");
        r = new Review(9, new Date(1491696000000L),"Ben");
        r.setId(676);
        r.setMediaId(602);
        r.setReview("A lot of redeeming going around and it had a happy ending.\n\nPerformance: 9\n\nPlot: 10\n\nCharacters: 10\n\nCleverness: 8");
        m.getReviews().add(r);

        r = new Review(8, new Date(1491696000000L),"Diana");
        r.setId(677);
        r.setMediaId(602);
        r.setReview("Not higher becuase I feel like there is background missing. Molly and Magwich and Scarface and Haveshem. Would have like more details.");
        m.getReviews().add(r);

        media.add(m);
        m = new Media("Sherlock Holmes","Sir Arthur Conan Doyle","Book");
        m.setId(615);
        m.setSeason("");
        m.setEpisode("B32 Charles Augustus Milverton");
        r = new Review(10, new Date(1491868800000L),"Ben");
        r.setId(693);
        r.setMediaId(615);
        r.setReview("Presentation: 10\nVery thrilling and exciting\n\nPlot: 9\nKinda simple but still a lot of fun and pretty good for a short story\n\nCharacters: 10\nReally loved all the characters. Well done!\n\nCleverness: 10\nIs it moral to burgal someone's house to save someone's good name?");
        m.getReviews().add(r);

        r = new Review(8, new Date(1493164800000L),"Diana");
        r.setId(786);
        r.setMediaId(615);
        r.setReview("Fasinating and suspenseful. The conclusion... the guy deserved punishment but his death was revenge and I don't know that it can be justified. It probably wasn't justified.");
        m.getReviews().add(r);

        media.add(m);
        m = new Media("Bleak House","BBC","Movie");
        m.setId(634);
        m.setSeason("");
        m.setEpisode("E6");
        r = new Review(8, new Date(1492300800000L),"Ben");
        r.setId(726);
        r.setMediaId(634);
        r.setReview("Performance: 8\n\nPlot: 8\nFirst time we realized...\nSPOILER:\n... that Lady Deathlock thought Esther was dead and first found out that Esther was alive from Guppy.\n\nCharacters: 8\n\nCleverness: 7");
        m.getReviews().add(r);

        r = new Review(9, new Date(1492300800000L),"Diana");
        r.setId(727);
        r.setMediaId(634);
        r.setReview("");
        m.getReviews().add(r);

        media.add(m);
        m = new Media("Sherlock Holmes","Sir Arthur Conan Doyle","Book");
        m.setId(676);
        m.setSeason("");
        m.setEpisode("B39 Hound of the Baskervilles, The");
        r = new Review(10, new Date(1493251200000L),"Ben");
        r.setId(776);
        r.setMediaId(676);
        r.setReview("Presentation: 10\nWonderful! I loved having a full length story of Sherlock and Watson!\n\nPlot: 10\nVery interesting. At first it was hazy but it became pretty clear as it progressed, still a lot of fun.\n\nCharacters: 9\nLoved the characters!\n\nCleverness: 9\nVery good but still was a smidge predictable.");
        m.getReviews().add(r);

        r = new Review(9, new Date(1493856000000L),"Diana");
        r.setId(838);
        r.setMediaId(676);
        r.setReview("");
        m.getReviews().add(r);

        media.add(m);
        m = new Media("Temple, The","George Herbert","Poem");
        m.setId(707);
        m.setSeason("");
        m.setEpisode("Love (III)");
        r = new Review(8, new Date(1493596800000L),"Ben");
        r.setId(823);
        r.setMediaId(707);
        r.setReview("Structure: 7\n\nContent: 7\n\nMeaning: 8\n\nCleverness: 8");
        m.getReviews().add(r);

        r = new Review(9, new Date(1493596800000L),"Diana");
        r.setId(824);
        r.setMediaId(707);
        r.setReview("");
        m.getReviews().add(r);

        media.add(m);
        m = new Media("Bleak House","BBC","Movie");
        m.setId(727);
        m.setSeason("");
        m.setEpisode("E11");
        r = new Review(9, new Date(1494028800000L),"Ben");
        r.setId(853);
        r.setMediaId(727);
        r.setReview("Performance: 8\n\nCharacters: 9\n\nPlot: 9\n\nCleverness: 8\nWas the murder of Tolkinghorn just?");
        m.getReviews().add(r);

        r = new Review(9, new Date(1494028800000L),"Diana");
        r.setId(854);
        r.setMediaId(727);
        r.setReview("");
        m.getReviews().add(r);

        media.add(m);
        m = new Media("Bleak House","BBC","Movie");
        m.setId(728);
        m.setSeason("");
        m.setEpisode("E12");
        r = new Review(9, new Date(1494028800000L),"Ben");
        r.setId(855);
        r.setMediaId(728);
        r.setReview("Performance: 9\n\nCharacters: 9\n\nPlot: 9\nI didn't realize that George and the self-made-man were brothers!\n\nCleverness: 9");
        m.getReviews().add(r);

        r = new Review(9, new Date(1494028800000L),"Diana");
        r.setId(856);
        r.setMediaId(728);
        r.setReview("");
        m.getReviews().add(r);

        media.add(m);
        m = new Media("Bleak House","BBC","Movie");
        m.setId(729);
        m.setSeason("");
        m.setEpisode("E13");
        r = new Review(8, new Date(1494028800000L),"Ben");
        r.setId(857);
        r.setMediaId(729);
        r.setReview("Performance: 8\n\nCharacters: 9\n\nPlot: 9\n\nCleverness: 6");
        m.getReviews().add(r);

        r = new Review(9, new Date(1494028800000L),"Diana");
        r.setId(858);
        r.setMediaId(729);
        r.setReview("");
        m.getReviews().add(r);

        media.add(m);
        m = new Media("Bleak House","BBC","Movie");
        m.setId(733);
        m.setSeason("");
        m.setEpisode("E14");
        r = new Review(8, new Date(1494115200000L),"Diana");
        r.setId(863);
        r.setMediaId(733);
        r.setReview("");
        m.getReviews().add(r);

        r = new Review(9, new Date(1494115200000L),"Ben");
        r.setId(864);
        r.setMediaId(733);
        r.setReview("Performanvce: 10\n\nCharacters: 10\nEsther's rebuke of Skimpole was awesome\n\nPlot: 10\n\nCleverness: 6");
        m.getReviews().add(r);

        media.add(m);
        m = new Media("Bleak House","BBC","Movie");
        m.setId(734);
        m.setSeason("");
        m.setEpisode("E15");
        r = new Review(9, new Date(1494201600000L),"Ben");
        r.setId(865);
        r.setMediaId(734);
        r.setReview("Performance; 9\n\nCharacters: 9\nSo glad Jaundice and Esther didn't get married.\n\nPlot: 9\nEmotional roller coaster\n\nCleverness:7");
        m.getReviews().add(r);

        r = new Review(8, new Date(1494201600000L),"Diana");
        r.setId(1029);
        r.setMediaId(734);
        r.setReview("");
        m.getReviews().add(r);

        media.add(m);
        m = new Media("Remarkable Way We Eat Pizza","Numberphile","YouTube");
        m.setId(756);
        m.setSeason("");
        m.setEpisode("");
        r = new Review(10, new Date(1494288000000L),"Ben");
        r.setId(888);
        r.setMediaId(756);
        r.setReview("Performance: 10\nLoved the enthusiasm! I hope to be like this when I'm old.\n\nContent: 10\nVery interesting, practical application of a math concept! Loved it!\n\nCleverness: 10\nPizza :D");
        m.getReviews().add(r);

        r = new Review(9, new Date(1494288000000L),"Diana");
        r.setId(896);
        r.setMediaId(756);
        r.setReview("Because I hope Ben will be like him");
        m.getReviews().add(r);

        media.add(m);
        m = new Media("Sherlock Holmes","Sir Arthur Conan Doyle","Book");
        m.setId(790);
        m.setSeason("");
        m.setEpisode("B47 Devil's Foot, The");
        r = new Review(10, new Date(1494460800000L),"Diana");
        r.setId(916);
        r.setMediaId(790);
        r.setReview("");
        m.getReviews().add(r);

        r = new Review(7, new Date(1496620800000L),"Ben");
        r.setId(1180);
        r.setMediaId(790);
        r.setReview("Presentation: 9\nVery engaging and exciting\n\nPlot:7\nMakes sense and was a bit preditable. I figured the brother did it and that he was killed by the doctor but I didn't know how.\n\nCharacters: 6\nWhy were the siblings hanging out? What happened to the brothers? Whats the deal with the vicor?\n\nCleverness:7\nDevil's foot was an interesting way to die but also felt like a cop-out answer instead of something really clever.");
        m.getReviews().add(r);

        media.add(m);
        m = new Media("Screwtape Letters, The","CS Lewis Doodle","YouTube");
        m.setId(793);
        m.setSeason("");
        m.setEpisode("C1");
        r = new Review(7, new Date(1494547200000L),"Ben");
        r.setId(920);
        r.setMediaId(793);
        r.setReview("Performance: 7\n\nContent: 7\n\nCleverness: 7");
        m.getReviews().add(r);

        r = new Review(10, new Date(1494547200000L),"Diana");
        r.setId(921);
        r.setMediaId(793);
        r.setReview("");
        m.getReviews().add(r);

        media.add(m);
        m = new Media("Temple, The","George Herbert","Poem");
        m.setId(805);
        m.setSeason("");
        m.setEpisode("Search, The");
        r = new Review(9, new Date(1494633600000L),"Ben");
        r.setId(936);
        r.setMediaId(805);
        r.setReview("Presentation: 9\n\nContent: 9\nLove the imagery. 'I sent a sigh to seek thee out, deep drawn in pain, winged like an arrow: but my scout returns in vain.'\n\nMeaning: 10\nVery real rut in which every christian gets stuck. Love the advise and comrodery that this poem offers.\n\nCleverness: 9");
        m.getReviews().add(r);

        r = new Review(8, new Date(1494633600000L),"Diana");
        r.setId(937);
        r.setMediaId(805);
        r.setReview("");
        m.getReviews().add(r);

        media.add(m);
        m = new Media("Seven Brides for Seven Brothers","Stanley Donen","Movie");
        m.setId(820);
        m.setSeason("");
        m.setEpisode("");
        r = new Review(8, new Date(1494806400000L),"Ben");
        r.setId(955);
        r.setMediaId(820);
        r.setReview("Performance: 8\nGreat music and dancing.\n\nPlot: 8\nI thought it was interesting. Though I wouldn't force my daughters to marry someone because they were raped and had a kid. Or because they had a kid out of wedlock.\n\nCharacters: 9\nLoved the brothers, especially Gideon. He is a very sweet man.\n\nCleverness: 7");
        m.getReviews().add(r);

        r = new Review(10, new Date(1494806400000L),"Anastasia Strong");
        r.setId(975);
        r.setMediaId(820);
        r.setReview("One of my favorite musicals");
        m.getReviews().add(r);

        media.add(m);
        m = new Media("Anatomy & Physiology","CrashCourse","YouTube");
        m.setId(833);
        m.setSeason("");
        m.setEpisode("L2 Tissues, Part 1");
        r = new Review(9, new Date(1494892800000L),"Ben");
        r.setId(969);
        r.setMediaId(833);
        r.setReview("Performance: 8\n\nContent: 9\nNervous tissue and muscle tissue. Very interesting to learn about these things.\n\nCleverness: 9\nI'm learning about my body! This is intriguing.");
        m.getReviews().add(r);

        r = new Review(8, new Date(1494892800000L),"Diana");
        r.setId(970);
        r.setMediaId(833);
        r.setReview("");
        m.getReviews().add(r);

        media.add(m);
        m = new Media("Spirits in Bondage","C.S. Lewis","Poem");
        m.setId(885);
        m.setSeason("S1 Prison House, The");
        m.setEpisode("P3 Satyr, The");
        r = new Review(8, new Date(1495238400000L),"Ben");
        r.setId(1042);
        r.setMediaId(885);
        r.setReview("Structure: 7\n\nContent: 8\nVery descriptive. I like that.\n\nMeaning: 8\nIt seems that the author has some physical attributes that aren't pleasant ('dreadful fee'), he is self-conscious ('sad eyes') and it drives the maidens away.\n\nCleverness: 8");
        m.getReviews().add(r);

        r = new Review(9, new Date(1495238400000L),"Diana");
        r.setId(1043);
        r.setMediaId(885);
        r.setReview("");
        m.getReviews().add(r);

        media.add(m);
        m = new Media("Jane Eyre","Masterpiece Theatre","Movie");
        m.setId(907);
        m.setSeason("");
        m.setEpisode("P1");
        r = new Review(9, new Date(1495411200000L),"Ben");
        r.setId(1063);
        r.setMediaId(907);
        r.setReview("Performance: 8\n\nPlot: 10\nVery interesting\n\nCharacters: 10\n\nCleverness: 8");
        m.getReviews().add(r);

        r = new Review(9, new Date(1495411200000L),"Diana");
        r.setId(1064);
        r.setMediaId(907);
        r.setReview("");
        m.getReviews().add(r);

        media.add(m);
        m = new Media("Jane Eyre","Masterpiece Theatre","Movie");
        m.setId(918);
        m.setSeason("");
        m.setEpisode("P2");
        r = new Review(9, new Date(1495497600000L),"Ben");
        r.setId(1079);
        r.setMediaId(918);
        r.setReview("Performance: 9\n\nPlot: 9\n\nCharacters: 9\nVery interesting characters.\n\nCleverness: 9\nIs it ok to have been trying to marry someone when lawfully married to someone else?");
        m.getReviews().add(r);

        r = new Review(9, new Date(1495497600000L),"Diana");
        r.setId(1080);
        r.setMediaId(918);
        r.setReview("");
        m.getReviews().add(r);

        media.add(m);
        m = new Media("Newsies","Disney","Movie");
        m.setId(939);
        m.setSeason("");
        m.setEpisode("");
        r = new Review(10, new Date(1495756800000L),"Ben");
        r.setId(1108);
        r.setMediaId(939);
        r.setReview("Good Stuff: \nCivil disobedience instead of violence. Jack and David both had exemplary characters.\n\nPerformance: 10\nLove the singing and choreography\n\nPlot: 10\nGripping\n\nCharacters: 9\nReally good but a lot of them could have had more depth, still really well done.\n\nCleverness: 9\nThe power of the press is a good thing to consider");
        m.getReviews().add(r);

        r = new Review(7, new Date(1495756800000L),"Diana");
        r.setId(1109);
        r.setMediaId(939);
        r.setReview("");
        m.getReviews().add(r);

        media.add(m);
        m = new Media("Croods, The","DreamWorks","Movie");
        m.setId(951);
        m.setSeason("");
        m.setEpisode("");
        r = new Review(9, new Date(1495843200000L),"Ben");
        r.setId(1122);
        r.setMediaId(951);
        r.setReview("Good Stuff:\nFamily and dad sacrificing for them and looking out for them. 'Follow the light' I don't know if that is good or bad.\n\nBad Stuff:\nA lot of joking about death/murder. Guy says that he needs to end the Croods when he first meets them. Grug is desiring the death of his mother-in-law.\n\nPerformance: 8\n\nPlot: 9\nSimple but it was still really good.\n\nCharacters: 10\nI like the whole family but Guy and Thunk are my favorite\n\nCleverness: 8");
        m.getReviews().add(r);

        r = new Review(10, new Date(1495843200000L),"Diana");
        r.setId(1123);
        r.setMediaId(951);
        r.setReview("");
        m.getReviews().add(r);

        r = new Review(7, new Date(1495843200000L),"Anastasia Strong");
        r.setId(1129);
        r.setMediaId(951);
        r.setReview("");
        m.getReviews().add(r);

        media.add(m);
        m = new Media("Anatomy & Physiology","CrashCourse","YouTube");
        m.setId(1004);
        m.setSeason("");
        m.setEpisode("L5 Tissues, Part 4");
        r = new Review(8, new Date(1496793600000L),"Ben");
        r.setId(1194);
        r.setMediaId(1004);
        r.setReview("Performance: 9\nPretty funny and very engaging. Also had a great amount of information packed into it.\n\nContent: 7\nCool stuff to know!\n\nCleverness: 7\nSomething to think about when pondering your bodies woes.");
        m.getReviews().add(r);

        r = new Review(9, new Date(1496793600000L),"Diana");
        r.setId(1195);
        r.setMediaId(1004);
        r.setReview("");
        m.getReviews().add(r);

        media.add(m);
        m = new Media("Sherlock Holmes","Sir Arthur Conan Doyle","Book");
        m.setId(1048);
        m.setSeason("");
        m.setEpisode("B53 Sussex Vampire, The");
        r = new Review(9, new Date(1497657600000L),"Ben");
        r.setId(1249);
        r.setMediaId(1048);
        r.setReview("Presentation: 8\nVery interesting\n\nPlot: 9\nIntriguing. Why would she drink the blood and give no explanation?\n\nCharacters: 9\nVery good characters for the mom/dad/son\n\nCleverness: 9\nThe fact that your perception of what has happened can be so far off is frightening. It is also a good reminder of good communication between parents, you should listen to reason.");
        m.getReviews().add(r);

        r = new Review(9, new Date(1494547200000L),"Diana");
        r.setId(1253);
        r.setMediaId(1048);
        r.setReview("");
        m.getReviews().add(r);

        media.add(m);
        m = new Media("Great British Baking Show, The","BBC","TV Series");
        m.setId(1070);
        m.setSeason("S5");
        m.setEpisode("E9");
        r = new Review(8, new Date(1497916800000L),"Ben");
        r.setId(1274);
        r.setMediaId(1070);
        r.setReview("Performance: 8\nBest one yet\n\nContent: 8\n\nCleverness: 7");
        m.getReviews().add(r);

        r = new Review(9, new Date(1497916800000L),"Diana");
        r.setId(1275);
        r.setMediaId(1070);
        r.setReview("");
        m.getReviews().add(r);

        media.add(m);
        m = new Media("When Satan Steals Your Motherhood","Christie Elkins","Article");
        m.setId(1080);
        m.setSeason("");
        m.setEpisode("");
        r = new Review(9, new Date(1498262400000L),"Diana");
        r.setId(1295);
        r.setMediaId(1080);
        r.setReview("A wonderful reminder to moms (and dads) not to let Satan steal your joy in parenting.");
        m.getReviews().add(r);

        r = new Review(8, new Date(1498262400000L),"Ben");
        r.setId(1296);
        r.setMediaId(1080);
        r.setReview("Presentation: 7\n\nContent: 9\nGood reminder to guard your heart against the tempation to get frustrated when life is hectic\n\nCleverness: 9\nSomething to keep in mind.");
        m.getReviews().add(r);

        media.add(m);
        m = new Media("Avatar: The Last Airbender","Nickolodean","TV Series");
        m.setId(1181);
        m.setSeason("Book 1: Water");
        m.setEpisode("Chapter 10: Jet");
        r = new Review(9, new Date(1501286400000L),"Ben");
        r.setId(1441);
        r.setMediaId(1181);
        r.setReview("Performance: 9\n\nPlot: 8\n\nCharacters: 9\nSakka was awesome. Doing the right thing, even if it isn't easy\n\n'''\nYou became the traitor when you stopped protecting innocent people.\n'''\n\nCleverness: 8");
        m.getReviews().add(r);

        r = new Review(9, new Date(1501286400000L),"Diana");
        r.setId(1443);
        r.setMediaId(1181);
        r.setReview("");
        m.getReviews().add(r);

        media.add(m);
        m = new Media("Avatar: The Last Airbender","Nickolodean","TV Series");
        m.setId(1183);
        m.setSeason("Book 1: Water");
        m.setEpisode("Chapter 12: Storm, The");
        r = new Review(10, new Date(1501372800000L),"Ben");
        r.setId(1446);
        r.setMediaId(1183);
        r.setReview("Really good. I loved the bacckground we get on Aang and Zuko. It really helps develop them both a lot more. I don't think I realized how honorable Zuko was. He is actually not that bad of a guy. I love Iroh and Gyatso. Really good episode.\n\nPerformance: 9\n\nPlot: 10\n\nCharacters: 10\n\nCleverness: 9");
        m.getReviews().add(r);

        r = new Review(9, new Date(1501372800000L),"Diana");
        r.setId(1447);
        r.setMediaId(1183);
        r.setReview("");
        m.getReviews().add(r);

        media.add(m);
        m = new Media("Wives & Daughters","BBC","Movie");
        m.setId(1187);
        m.setSeason("");
        m.setEpisode("P1");
        r = new Review(8, new Date(1501372800000L),"Ben");
        r.setId(1454);
        r.setMediaId(1187);
        r.setReview("Performance: 8\n\nPlot: 8\n\nCharacters: 8\n\nCleverness: 6");
        m.getReviews().add(r);

        r = new Review(9, new Date(1501372800000L),"Diana");
        r.setId(1455);
        r.setMediaId(1187);
        r.setReview("Many admirable qualities in many of the characters, most notably in Rodger and Molly. The foul characters are quite foul. ");
        m.getReviews().add(r);

        r = new Review(9, new Date(1501372800000L),"Hannah Parcher");
        r.setId(1456);
        r.setMediaId(1187);
        r.setReview("Excellent movie! ");
        m.getReviews().add(r);

        media.add(m);
        m = new Media("Wives & Daughters","BBC","Movie");
        m.setId(1188);
        m.setSeason("");
        m.setEpisode("P2");
        r = new Review(7, new Date(1501372800000L),"Ben");
        r.setId(1457);
        r.setMediaId(1188);
        r.setReview("Performance: 7\n\nPlot: 7\n\nCharacters: 7\n\nCleverness: 6");
        m.getReviews().add(r);

        r = new Review(9, new Date(1501372800000L),"Diana");
        r.setId(1458);
        r.setMediaId(1188);
        r.setReview("");
        m.getReviews().add(r);

        r = new Review(9, new Date(1501372800000L),"Hannah Parcher");
        r.setId(1459);
        r.setMediaId(1188);
        r.setReview("");
        m.getReviews().add(r);

        media.add(m);
        m = new Media("Avatar: The Last Airbender","Nickolodean","TV Series");
        m.setId(1208);
        m.setSeason("Book 1: Water");
        m.setEpisode("Chapter 20: Siege of the North P2");
        r = new Review(9, new Date(1502323200000L),"Ben");
        r.setId(1486);
        r.setMediaId(1208);
        r.setReview("Performance: 8\n\nPlot: 9\nA lot of stuff happened\n\nCharacters: 9\nSo sad... poor Sakka\n\nCleverness: 9");
        m.getReviews().add(r);

        r = new Review(8, new Date(1502323200000L),"Diana");
        r.setId(1487);
        r.setMediaId(1208);
        r.setReview("");
        m.getReviews().add(r);

        media.add(m);
        m = new Media("Screwtape Letters, The","CS Lewis Doodle","YouTube");
        m.setId(1212);
        m.setSeason("");
        m.setEpisode("C6");
        r = new Review(9, new Date(1502582400000L),"Ben");
        r.setId(1491);
        r.setMediaId(1212);
        r.setReview("Performance: 9\n\nContent: 9\nIt was short, but it was dense. Something like this written in modern day would be awesome!\n\nCleverness: 10\nWhat really hit me:\n'''\nFocus his malice on the real people in his life (his mother, his employer, the guy on the bus) and focus his benevolence on unseen strangers (people he doesn't know). Then his mailice becomes real and his benevolence becomes imagenary\n'''");
        m.getReviews().add(r);

        r = new Review(9, new Date(1502582400000L),"Diana");
        r.setId(1492);
        r.setMediaId(1212);
        r.setReview("I am stunned with the profoundness and clarity with which CS Lewis wrote. He was very articulate.");
        m.getReviews().add(r);

        media.add(m);
        m = new Media("Avatar: The Last Airbender","Nickolodean","TV Series");
        m.setId(1216);
        m.setSeason("Book 2: Earth");
        m.setEpisode("Chapter 1: Avatar State, The");
        r = new Review(9, new Date(1502582400000L),"Ben");
        r.setId(1497);
        r.setMediaId(1216);
        r.setReview("Performance: 9\n\nPlot: 9\nThe crazy earth bender guy didn't make much sense. Why did his soldiers follow his orders?\n\nCharacters: 10\nZuko, Iroh and Azula were very well done.\n\nCleverness: 9");
        m.getReviews().add(r);

        r = new Review(8, new Date(1502582400000L),"Diana");
        r.setId(1498);
        r.setMediaId(1216);
        r.setReview("");
        m.getReviews().add(r);

        media.add(m);
        m = new Media("Ranger's Apprentice","John Flanagan","Book");
        m.setId(1230);
        m.setSeason("");
        m.setEpisode("B1 Ruins of Gorlan, The");
        r = new Review(9, new Date(1504915200000L),"Ben");
        r.setId(1515);
        r.setMediaId(1230);
        r.setReview("Good Stuff:\nFriendship and self-sacrifice are big things and presented well.\n\nBad Stuff:\nThere is some bad language. Enough of it to make me not want the audiobook. But it wasn't that bad or frequent, some sharpie could fix that. Horace's treatment of his bullies also gave me pause (but I'm up in the air on it).\n\nOverall:\nReally good, even after all these years.\n\nPresentation: 8\nReally good descriptions and very engaging. My only complaint is that some things got the same descriptions over and over and over. 'Grey and green motled cloak', 'shaggy pony', etc.\n\n\nPlot: 8\nReally good, very engaging and enjoyable. But I didn't enjoy the ending as much. It seems really over the top how Will was recieved and praised for (defeating the boar) killing the Kalkara. It seemed a little disproportionate and weird. But I guess the Baron's intention was to grant Will permission to be a warrior and make much out of it.\n\nCharacters: 9\nI really loved all the characters. The bad guy is really 1D but the rest of them have at least a little depth. And the main characters (Will, Halt, Horace, Rodney, Arald) have a lot of depth. Almost all the characters have personality. Hopefully in the next books, the bad guys will be a little more fleshed out.\n\nCleverness: 9\nReally interesting story where the protagonist is just a man (no super powers). I also like the description of mideavel everyday life.");
        m.getReviews().add(r);

        r = new Review(8, new Date(1504915200000L),"Diana");
        r.setId(1516);
        r.setMediaId(1230);
        r.setReview("");
        m.getReviews().add(r);

        media.add(m);
        m = new Media("Avatar: The Last Airbender","Nickolodean","TV Series");
        m.setId(1240);
        m.setSeason("Book 2: Earth");
        m.setEpisode("Chapter 7: Zuko Alone");
        r = new Review(9, new Date(1505433600000L),"Ben");
        r.setId(1530);
        r.setMediaId(1240);
        r.setReview("Performance: 8\n\nPlot: 9\n\nCharacters: 9\n\nCleverness: 9\nI've seen this episode for the 4th or 5th time and I think I've finally understood. Azula told the truth that Zuko was to be sacrificed and so Ursa killed the Fire Lord and fled. Then Ozai took the throne under false pretenses.");
        m.getReviews().add(r);

        r = new Review(9, new Date(1505433600000L),"Diana");
        r.setId(1531);
        r.setMediaId(1240);
        r.setReview("");
        m.getReviews().add(r);

        media.add(m);
        m = new Media("Avatar: The Last Airbender","Nickolodean","TV Series");
        m.setId(1241);
        m.setSeason("Book 2: Earth");
        m.setEpisode("Chapter 8: Chase, The");
        r = new Review(10, new Date(1505606400000L),"Ben");
        r.setId(1532);
        r.setMediaId(1241);
        r.setReview("Love this episode for the characters and how pivotal it is to the rest of the series.\n\nPerformance: 9\n\nPlot: 10\n\nCharacters: 10\n\nCleverness: 9");
        m.getReviews().add(r);

        r = new Review(9, new Date(1505606400000L),"Diana");
        r.setId(1533);
        r.setMediaId(1241);
        r.setReview("");
        m.getReviews().add(r);

        media.add(m);
        m = new Media("Avatar: The Last Airbender","Nickolodean","TV Series");
        m.setId(1253);
        m.setSeason("Book 2: Earth");
        m.setEpisode("Chapter 12: Serpent's Pass, The");
        r = new Review(10, new Date(1506643200000L),"Ben");
        r.setId(1550);
        r.setMediaId(1253);
        r.setReview("Performance: 9\n\nPlot: 9\n\nCharacters: 10\nSakka's sacrifice of Momo and Toph's kiss, etc.\n\nCleverness: 10");
        m.getReviews().add(r);

        r = new Review(7, new Date(1506643200000L),"Diana");
        r.setId(1551);
        r.setMediaId(1253);
        r.setReview("");
        m.getReviews().add(r);

        media.add(m);

        return media;
    }
}
