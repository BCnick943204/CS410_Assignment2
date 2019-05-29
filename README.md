# CS410_Assignment2
Nick Passantino

I modified the JProgressBar heavily and a source I used for help with that was:
http://www.java2s.com/Tutorials/Java/Swing_How_to/JProgressBar/Create_custom_UI_for_progress_bar.htm

The constructors for the SensorPanel Objects also take sone int parameters
in their constructors. This was mostly because I didn't realize that the
getReport() method would yeild wether it was critical or not, but I kept
it in (even after modifying to use the getReport() method) because these
int values make the bar easy to proportion.