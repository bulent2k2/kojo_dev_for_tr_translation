Did you read the wonderful book: Stumbling on Happiness by Harvard psychologist Daniel Gilbert? I would recommend it highly if you are interested in emotions, psychology and the human mind:

http://www.randomhouse.com/kvpa/gilbert/blog/

But, that's another story. I bring it up here because that's exactly what's happened to me: I stumbled on Kojo almost a year ago. Let me explain :-)   

It was October of 2020 and I have been enjoying an early retirement -- highly recommended, too, if you feel like you've worked hard&long enough 😇. I wanted to use some of my time to help my then 9 year old son to learn programming. But, I didn't want him to learn Javascript, Python or Java, let alone C or C++! I wanted him to start natively in a good, healthy and practical functional language -- nothing beats one's mother tongue, does it? And Scala seemed very promısıng. But, I didn't want him to have to learn sbt, ammonite, or just stay with boring text. After all, he was used to good graphical environments like scratch from MIT. And, a year ago (2020.10.10 or so), I did a google search: "scala for kids" and got: 

https://www.scala-lang.org/old/node/5624

which had a link to:

https://www.kogics.net/sf:start

which had a link to:

https://github.com/litan/kojo

which mentioned:

    "The Kojo Localization file tells you how to translate Kojo to your language." 

That got me very very excited! My kids are bilingual in Turkish and English and it would be great for my youngest to practice his Turkish a bit more! So, I reached out to Lalit with an email and told him that I would like to contribute to Turkish support in Kojo. He promptly gave me a hand -- Lalit, I can't thank you enough for giving Kojo to the world and all the help you provide lovingly! -- and I got Levels 1 and 2 taken care of in a few days of intense effort, like a sprint runner -- and then jumped right into Level 3.

There are of course many many wonderful scripts in Kojo samples and showcases menus. It would be more of a marathon to run. But, hey, time is what a retiree has got :-) One only needs to pace oneself to finish the marathon. It took about three months to translate the bulk of those scripts. The bigger challenges were (1) the wonderful scala tutorial for beginners and (2) the wonderful Picture module. 

(1) The scala tutorial not only introduces many features of the language, but also gives a quick intro to turtle graphics and gaming. The simple bouncing ball, the paddle ball game, the clock, the game of life, and the tangle puzzle game got me hooked. I wanted to translate those scripts, too! Back then they used the obsolete Staging utility, and that's what I originally translated, but, after translating the Picture utility, we were able to easily convert all those to Pictures as well!

(2) Kojo's turtle is a great drawing utility, but, the Picture library was the way to go not only for sophisticated graphics but also for animations and games. 

After adding more and more to the trInit.scala file, I realized that I needed to refactor things into modules. Long functions and long files tell you its time to organize... 

In Kojo, we have a subdirectory under the resources/samples/ folder for each language -- like, es, de, nl, tr, etc.. and <xy>Init.scala under lite/i18n:

    "kojo/src/main/resources/samples/tr"
    "kojo/src/main/scala/net/kogics/kojo/lite/i18n/trInit.scala"
  
Similar to the structure under the samples folder, I created the tr subfolder under i18n: 
  
    "kojo/src/main/scala/net/kogics/kojo/lite/i18n/tr/"
  
which has bunch of scala files, one for Picture, one each for Range, swing (only what we use in our scripts from this wonderful and huge java library), Array, Map, Queue/Stack, Math, Vector2D, etc.. The translation project in general is not theoretically complete, of course -- scala collection library is rich let alone all the java libs out there in English! -- but the Picture library is now fully translated with ComposableTransformers like trans(10, 20) * rot(90) * scale(0.5) -> Picture.circle(10), along with all the methods in Picture even the higher order functions that let us use the turtle drawing commands (in Turkish) wrapped in a Picture! It took less than 400 lines to pull this off. And again, I'd like to thank Lalit for helping answer many questions on the way. Please see:

    "kojo/src/main/scala/net/kogics/kojo/lite/i18n/tr/resim.scala"

Our next challenge is to somehow provide translations for all Scala/Java keywords like val, var, for, if, else, new, etc. in the local language. Doing the translation work is easier and already done. See:

    "kojo/src/main/scala/net/kogics/kojo/lite/i18n/tr/dict.scala"
  
Now, we need something like a compiler plugin to get it to be functional. I wish there was a command like rename in Tcl! Please let me know if anybody has any suggestions. And, once we do it for one language, we can easily scale to all. That would make a nice Level 4, or we could even make it part of Level 1! 

Thanks for reading and please contact me with any thoughts, comments or suggestions at ben@scala.org or bulent2k2@gmail.com. Take care!
