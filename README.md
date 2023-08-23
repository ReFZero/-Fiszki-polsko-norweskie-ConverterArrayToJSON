# Fiszki polsko-norweskie ConverterArrayToJSON

The converter was created to automatic convert arrays into the necessary files containing words for the application. </br>
During the refactoring of the code from May 13, 2023, the way of storing words was changed in the application.</br>
Instead of tables, a list and JSON files were used as a database. </br>
The converter fetches the arrays. It turns it into a list of words and adds an offset so that the indexes of the objects do not repeat.
The collection is then mapped to a JSON file. </br> 
After that the file is ready to be used in the main application.
