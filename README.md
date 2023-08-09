### SMUBird! is a CS205 project for the Module CS205 Operating System Concepts With Android
**The task was to create an Android app with either Java or Kotlin, using Android Studio Code, and to implement some form of concurrency, along with a few other additional features.**

The 5 **compulsory** features to implement include:
| Requirement  | Explanation | Details | 
| ------------- | ------------- | -------------- |
| Application contains at least 1 activity drawn using 2D Graphics  | Hand Drawn using pixels, GIMP Application  | SMU Bird Home Page, SMU Bird Icon, SMU Buildings (Obstacles), Main Background |
| Application works "Real-Time" amd has 3 types of dynamic elements which progress without human interaction (1. Real Time Elements update synchronously in each frame and animated 2. Interval elements updated synchronously at predetermined intervals with each update spanning fixed time delta 3. Asynchronous elements updated in separate threads, regardless of simulated time delta) | Manipulation of FPS in MainThread to allow for proper syncing between canvas and device capabilities | Main character icon flies and falls smoothly between frames, simulating real flight. Obnstacles are also consistently updated randomly across frames. Score and High Score are updated asynchronously and displayed at the end of every game run |
| Application is "interactive" and as such include behaviour triggered by user event | Response to user events using triggers and interfaces such as View.OnClickListener, invoking action per response   | Icon propels upwards on click, "falls" due to gravity when there is no touch response |
| Application perform parallel operations using 1 or more worker threads | Main and worker threads are executing simultaneously | Main Thread: Main process
Worker thread: Score Counter |
| Application ensures that threads synchronise updates to a common state with built in synchronisation primitives (MUTEXES) | Mutexes used to synchronise access of variable for multiple threads, preserving accuracy of value | Mutual exclusion lock preventing simultaneous access to or manipulation of High Score variable |

The 7 **additional** features implemented consisted of: 
| Feature  | Explanation | Details | 
| ------------- | ------------- | -------------- |
| Application contains at least 1 activity using standard GUI Components | Application utilises GUIs to construct screen layouts and interactive elements placements | TextView, Button, SeekBar, RelativeLayout, LinearLayout utilised for UI design under Options function |
| Support OS-related customisation of activities, or of the application of as a whole (Keep screen always ON) | The screen is kept on as long as the game is running| In MainActivity(), window is always on with using layoutParams with FLAG_KEEP_SCREEN_ON  |
| Integration of mobile feature (Vibration, Audio) | Vibration and audio as a BGM used | The device vibrates everytime onTouch occurs and in addition, apart form BGM, for every action the bird does, there is a sound file associated with it. |
| Application can preserve state of activity when destroyed | "Top Score" preserved automatically, even when app is minimised or restarted  | Top Score state is retained and displayed on next game attempted |
| Application supports advanced 2D graphics features  | Particle Effect System. | On main character icon flying upwards, particles are projectiled from the icon to show flight of motion |
| Application is a "simulation" and implements rules for system with natural forces (Gravity and propulsion) | Close simulation to gravity and propulsion through touch | Main character icon "falls" on lack of user touch interaction, simulating gravity, while propelling upwards on touch. |
| Application has advanced feature (Google Advertisement) | Addition of Google Ads that work and sync with a wifi connection  | Google Ads at bottom of game page |

The **Project Highlights** include: 
| Feature | Explanation |
|---------|-------------|
| Decoupling of MainThread from mainActivity which allows for thread creation, usage and manipulation. 
In addition, surfaceCreated() and surfaceDestroyed() methods are explicitly declared in mainActivity | This allows us to use thread-based methods like thread pool if we wanted to and control their creation & termination efficiently to help manage resources. |
| Implementation of Google Ads allow for revenue & commercialisation | With addition of testAds for this implementation since personal information will be leaked if an actual ad was used, we open our app to real-world monitization since all we have to do is change the key set in the code to allow for real google ads|
| Possible Integration with Google Console to allow for other services like Leaderboards on Google Console | With addition of Google Ads, we can integrate with the entire Google Console to have access to other APIs etc|
| Implementation of FPS as a manipulatable variable| By having FPS as a variable, we can increase or decrease it in line with other devices if needed  |
| Extensible code for particle system | Allows for extension of particle system to further add different effect if needed |
Uses Mutex and Multithreading, got an A+. To all SMU students who are trying to Google for a game, I don't mind if you use mine, but at the very least just ask me for permission or credit me, yeah?  
All the code is in Branch V0.1  


ChangeLog At A Glance  
Current Most Updated Branch: V0.1  

Master: First Push -> Contains entire app with sounds, and some basic threading. Kanban created  

V0.1: Second Push, new Branch V0.1 -> Implementation of Google Ads (Its an acceptable "advanced_feature")   

HEAD  
V0.1: Third Push -> Implementation of MultiThreading to play BGM Audio within MainActivity.java  
V0.1: 4th Push -> Implemented code to vibrate everytime onTouch (Doesnt work on mine idk why)
V0.1: 5th Push -> Fixed Vibration Bug (Still doesnt vibrate on mine), Brought version forward inline with project requirements  
V0.1: 6th Push -> Fixed Vibe Bug AGAIN, Added Options page with back to game button & mute music button, except mute music isnt working  
V0.1: 7th Push -> ADDED BOMB IMPLEMENTATION + Mute music not working + Vibration compiles but doesnt vibrate on mine 
(Currently the Bombs fly across the top and bottom of the screen at high speed -> need to edit the code params such that they appear as static objects  
at random positions on the screen as the game progresses + handle collision event on them)  


