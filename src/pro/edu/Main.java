package pro.edu;
/*
 *
 *
 * Version info
 *
 * Copyright notice
 */

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello, world");

       //  21/04/20      21.04.20    21-04-2020

       LocalDate today = LocalDate.now();
        System.out.println(today);

        LocalDate theFirstOfMay = LocalDate.of(2020, 5, 1);
        System.out.println(theFirstOfMay);
        System.out.println(theFirstOfMay.getDayOfWeek());
        System.out.println(today.plusDays(10));
        LocalDate newYear = LocalDate.of(2021, Month.JANUARY,1);
        System.out.println(newYear.getDayOfWeek());

        // когда в этом году будет День Программиста   256 день ?????
            LocalDate first = LocalDate.of(2020, Month.JANUARY,1);
        System.out.println(first.plusDays(255).getDayOfWeek());
        //  16 Jan 1976 year
        LocalDate day = LocalDate.of(1976,1, 16);
        System.out.println(day.getDayOfWeek());

        System.out.println(ChronoUnit.DAYS.between(LocalDate.now(), first));

        LocalDateTime now = LocalDateTime.now();
        LocalDateTime time = LocalDateTime.of(1970,1,1,0,0);

        System.out.println(now);

        System.out.println(ChronoUnit.SECONDS.between(time, LocalDateTime.now()));

        if (theFirstOfMay.isBefore(LocalDate.now())) System.out.println(true);

        //---------------------------------------------------------
          String myString = "\n" +
                  "The villagers of Little Hangleton still called it “the Riddle House,” even though it had been many years since the Riddle family had lived there. It stood on a hill overlooking the village, some of its windows boarded, tiles missing from its roof, and ivy spreading unchecked over its face. Once a fine looking manor, and easily the largest and grandest building for miles around, the Riddle House was now damp, derelict, and unoccupied.\n" +
                  "\n" +
                  "The Little Hangletons all agreed that the old house was “creepy.” Half a century ago, something strange and horrible had happened there, something that the older inhabitants of the village still liked to discuss when topics for gossip were scarce. The story had been picked over so many times, and had been embroidered in so many places, that nobody was quite sure what the truth was anymore. Every version of the tale, however, started in the same place: Fifty years before, at daybreak on a fine summer’s morning when the Riddle House had still been well kept and impressive, a maid had entered the drawing room to find all three Riddles dead.\n" +
                  "\n" +
                  "The maid had run screaming down the hill into the village and roused as many people as she could.\n" +
                  "\n" +
                  "“Lying there with their eyes wide open! Cold as ice! Still in their dinner things!”\n" +
                  "\n" +
                  "The police were summoned, and the whole of Little Hangleton had seethed with shocked curiosity and ill disguised excitement. Nobody wasted their breath pretending to feel very sad about the Riddles, for they had been most unpopular. Elderly Mr. and Mrs. Riddle had been rich, snobbish, and rude, and their grown up son, Tom, had been, if anything, worse. All the villagers cared about was the identity of their murderer—for plainly, three apparently healthy people did not all drop dead of natural causes on the same night.\n" +
                  "\n" +
                  "The Hanged Man, the village pub, did a roaring trade that night; the whole village seemed to have turned out to discuss the murders. They were rewarded for leaving their firesides when the Riddles’ cook arrived dramatically in their midst and announced to the suddenly silent pub that a man called Frank Bryce had just been arrested.\n" +
                  "\n" +
                  "“Frank!” cried several people. “Never!”\n" +
                  "\n" +
                  "Frank Bryce was the Riddles’ gardener. He lived alone in a run down cottage on the grounds of the Riddle House. Frank had come back from the war with a very stiff leg and a great dislike of crowds and loud noises, and had been working for the Riddles ever since.\n" +
                  "\n" +
                  "There was a rush to buy the cook drinks and hear more details.\n" +
                  "\n" +
                  "“Always thought he was odd,” she told the eagerly listening villagers, after her fourth sherry. “Unfriendly, like. I’m sure if I’ve offered him a cuppa once, I’ve offered it a hundred times. Never wanted to mix, he didn’t.”\n" +
                  "\n" +
                  "“Ah, now,” said a woman at the bar, “he had a hard war, Frank. He likes the quiet life. That’s no reason to—”\n" +
                  "\n" +
                  "“Who else had a key to the back door, then?” barked the cook. “There’s been a spare key hanging in the gardener’s cottage far back as I can remember! Nobody forced the door last night! No broken windows! All Frank had to do was creep up to the big house while we was all sleeping…”\n" +
                  "\n" +
                  "The villagers exchanged dark looks.\n" +
                  "\n" +
                  "“I always thought that he had a nasty look about him, right enough,” grunted a man at the bar.\n" +
                  "\n" +
                  "“War turned him funny, if you ask me,” said the landlord.\n" +
                  "\n" +
                  "“Told you I wouldn’t like to get on the wrong side of Frank, " +
                  "didn’t I, Dot?” said an excited woman in the corner.\n";

        final String[] array = myString.split(" ");

      //  System.out.println(array[2]);-----------------------------------

        for (int i = 0; i <= array.length-1 ; i++) {
            System.out.println(array[i]);
        }


    }




}
