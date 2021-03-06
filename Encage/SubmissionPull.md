
## Overview
<!-- 
Give an overview of the problem.
This section is mandatory
-->
Your team has created a monster killing game. Where you have decided to put
a menu named "Settings" from where an user can modify some game options.

Everyone in your team agreed that there shall be only one .cfg file to store the settings,
namely "Settings.cfg".

You are very proud to introduce this new file. The current state of the code can be 
found <a href = "https://github.com/KhalidMasum/OOC_Problem_Catalogue_mySrc/tree/master/Encage">HERE</a>. Your teammate Zahid
tells you, "It's pretty cool! We can easily add many cool features in our game now." 

You are celebrating your victory but in few days you started to notice strange things.
Making mistakes has become pretty common! 
One day Rahim comes and tell you,
"It's not our fault you know. We shouldn't even be able to access cursor settings when 
working with Blood. There are many other similar cases".

It certainly is a big problem. And you know that you have to fix it fast. 
So you have decided to change the code. So that your team members can 'define' 
what needs to be accessed when accessing the .cfg is necessary.

## Example
<!-- 
Give some examples of the scenario for a better understanding.
Try to use specific names and numbers.
Bad example: Age of person 1 is x
Good example: Age of Fatema is 30 years

This section is highly recommended, but not mandatory.
-->
While working in Cursor.java someone may mistakenly change BloodColor
## Assumptions
<!-- 
If there are some assumptions that the solver should have, mention here.
This section is optional.
-->
Settings.loadSettings() loads all the settings to the class from 
Settings.cfg file according to desired Type and Settings.storeSettings()
store current state of settings in the .cfg file

## Task
<!-- 
Specifically mention what to do.
This section is mandatory.
-->
Design the code in such a way that only certain part of Settings.cfg
can be read and written based on what you need to do.
 So that you don't make mistakes while developing
the game. 
#### Optional
Improving current state of the code is appreciated

---
<!-- Leave this part as it is -->
#### Reminders
* <sup>React to the problem if you find it interesting and helpful. This will help others to easily identify good problems to solve.</sup>
* <sup>Feel free to comment about the problem. Is the description unclear? Do you think it is too easy or too difficult than what is mentioned? Comment about it.</sup>
* <sup>Discussion about the solution is OK. But do not paste a solution here. Give a link to the solution instead.</sup>
* <sup>Do you have an interesting problem? [Post it](https://github.com/iut-cse/oo-problem-catalog/issues/new).</sup>
