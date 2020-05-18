# Perk by Daylight
An easy-to-use icon installer for the game [Dead by Daylight](https://store.steampowered.com/app/381210/Dead_by_Daylight/).
Inspired by [the subreddit with the same name](https://www.reddit.com/r/PerkByDaylight/).
<br /><br />

## How to Run

**Requirements**
<br />
*Perk by Daylight requires that you are on the Windows operating system (no specific version) and that you have Java Runtime Environment [version 1.8](https://www.oracle.com/technetwork/java/javase/downloads/jre8-downloads-2133155.html) or higher.*
<br /><br />
**Running**
<br />
Generally, most [releases](https://github.com/glitchedcoder/Perk-by-Daylight/releases) will also be shipped with a `run.bat` file.
This is a batch file that will run the program via the Command Line or whatever terminal you may have installed.
The `.JAR` file is not executable, so it must be ran with `java -jar FILENAME.jar` or `run.bat`.
<br /><br />
**Optional Command Arguments**
<br />
There are a list of arguments that is acceptable for Perk by Daylight.
* `-debug` This will output optional dialog to the console and is often used to "debug" the program. Very verbose.
* `-nocolor` This will disable coloring on the console and will make it harder to read. Perk by Daylight uses Jansi to output color.
## About
**Notes**
<br />
This program is **not a hack** and is not meant to be used while Dead by Daylight is open or running.
Improper use of this program could result in a false-positive on EasyAntiCheat's program and could get you falsely banned, just like manually installing icons could.
However, this is highly unlikely when used properly.
This program does not read, write, or modify game files, including game logs, in any way other than replacing `.PNG` files.
<br /><br />

**Software Requirements**
<br />

* Java [version 1.8](https://www.oracle.com/technetwork/java/javase/downloads/jre8-downloads-2133155.html) or higher.

That's it!
<br /> <br />
**Features**
<br />
*Already Added*
* Dark and light theme toggle.
* Icon pack selector and icon preview.
* The ability to install an icon pack either in folder form or `.zip` form.
* An easy-to-use updater, with the option to ignore updates.
* Locally cached icon packs with their respective meta files, so no need to keep that `.zip` file in your downloads folder.
* The ability to rename an existing icon pack.
* The ability to see your currently installed icons.

*Plan to be Added*
* Edit/update already existing icon packs.
* Get detailed information of the selected icon pack.
* Multi-threaded workload support, as to not lag UI and for a cleaner experience.
* A built-in dialog box for those who want to donate.
* Lots of documentation that needs to be added.

*Might be Added*
* The support for `.rar` files. This might not be possible since RAR files are proprietary and libraries like [JUnRAR](https://github.com/junrar/junrar) do not support WinRAR-compressed files.
* More themes? Feel free to create a PR with CSS and a name.

**Dependencies**
* GSON
* Guava
* FindBugs
* Jansi

**Screenshots**
<br />
***Note:** these screenshots are pre-release and features can change*
<br />
<br />
*Dark and Light Mode Toggle* - Toggle between dark and light mode simply.
![Dark and Light Mode Toggler](https://i.imgur.com/VAbAIQY.gif)

<br />

*Easy Updater* - Updating with a click of a button.
![Easy Updater](https://i.imgur.com/BgYooBq.gif)

<br />

*Simple Renaming* - Double-click the icon pack to rename it.
![Simple Renaming](https://i.imgur.com/tE9Bgz6.gif)

<br />