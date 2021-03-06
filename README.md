#CharacterCreator
##DnD 5e Character Creator by SanguineHaze

[version]1[/version]

#Required items:
- Java must be installed (www.java.com) & up to date

#Planned Updates (As of Mar 10, 2017):
[Note: These are unordered. They will be completed in order of whatever I wish to tackle first]
- Improve Race generation (Allow selections of races / race chance levels - common, rare, etc)
- Category based Stat Generation [Weak, Average, Base PC, Above Average, Epic] /u/eastwood6510
- Semi-Random Inventory Generation
- Semi-Random Loot Generation
- Handle Java Version issues [Will not work if java is out of date & fails silently]
- Create version control & program updater [So I won't have to continue posting updates on reddit]
- Webpage / Web Interface [Look into git.io pages]
- Actual Age Value (Either supplementing or replacing age category)
- Mobile App [Possibly being developed by /u/Kerooker
- Ability Modifiers
- Display & SaveFile printouts should look as close to a stat page as possible
- Extra / Ability Descriptions (Or links / hover text / something)
- Change Name generation so it is related to the chosen race
	- Include name length changes to match PHB/DMG racial name average lengths
	- Include clan names
		-Clan names (BLOCKED - Required: Race related naming)
- Change Nickname generation so it is based off of chosen race and chosen profession (where applicable)
	- Change "Child" nicknames to be 100% child oriented
- Change Motivations so that Child has a special set of motivations (Current motivations don't make much sense for children)

#Recent Updates
[history]
###Mar 8th, 2017
- Race & Subrace pairing improved
- Language builder (Statblocks) fixed

###Mar 6th - 7th, 2017
- Racial Statblocks introduced

###Mar 5th, 2017
- Load all lists & sourceData in one class (GenerateSourceData.java)

###Feb 2nd, 2017
- Fixed Bug: Bug noticed (2/2/2017): After successful generate, subrace list does not clear, and continues to duplicate entries.

###Dec 19th, 2016
- Refactor: Removed duplicate code which was being used in every class (sometimes multiple times) to build up the path to the sourceData folder & appropriate text file. This is now done in the ReadFromFile class. [25 chars now build in ~0.1 second]

###Dec 14, 2016
- Added Surnames
- Changed how nicknames are displayed (if it contains "the [Something]" it displays First Name / Last Name / Nickname. If not, it's First Name / Nickname / Last Name)
- Found & Corrected "save" bug where all results were being fed to the save Array even before it had been selected (Causing a save of every output since the program opened).
	- Found & corrected a subsequent bug where the Save list was not clearing.

###Dec 9, 2016
- Add user choice for Nickname chance (completed Dec 9/16)
- Add user choice for Additional Details chance (completed Dec 9/16)

#The initial plan (Begun Aug 24th, 2016 - Completed Nov 2, 2016):
Race > Subrace > M/F toggle > Name > Class || Job > defining features, personality, motivations
	-Features added beyond original idea: Swing GUI & a WriteToFile method (necessary for users & breaking out of IDE)
	-Features dropped: alignment (fuck alignment & the headaches it causes. My friends, be not distracted by such arbitrary definitions of good and evil!)
[/history]