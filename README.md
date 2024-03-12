# Multi-Threading-Visusalizer
Welcome to my Muti-Threading Visualizer
Made by Carson Crowley. 

This Program shows multiple threads running simultaneously. 
The code that is being executed within the threads are simple for-loops
which count up to the number 10. 

The point of this program is to present a visual representation of the idea of Multi-Threading. 

*Important Note* The button will add more threads, all which count to 10. You can add as many
threads as you want, however it will probably start to wig out if you add too many. 

This program was developed in Java using the Swing framework. 

For the each of the threads, I opted to implement the Runnable interface. I felt that this was a better
idea as opposed to extending the Threads class. Since Java does not allow multiple inheritence, I felt that
it would be better to implement an interface if classes DiffThread and ThreadOne still needed to inherit from 
some other superclass. 
