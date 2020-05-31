# Beer Advisor
## An Introduction: Android App 


## 1. Version Control: 

`
Version Control with Android Studio is fairly straight forward. Android Studio allows you to commit
and push content to GitHub (and others) with just a few quick clicks. There's a VCS option on the top
of Android Stuido that gives many options, as well as a Version Control Log and Console.
`

## 2. AVD (Android Virtual Device) Manager

`
Android Studio also has an AVD Manager that allows you to set up a virtual Android device simulation 
right on your screen. It's pretty cool, but I found that it can be pretty slow. Luckily there are other
options, mainly connecting your Android device to your computer through USB and running a simulation of
your app on your phone. This alows you to test your app and ensure things are the way you want them and 
it's much faster. 
`
## 3. Layouts, TextViews and Widgets

`
This app is fairly simple and allowed me to understand some basic concepts of Android Development. Let's 
take layouts as an example: In this project I used a Linear Layout for my main activity (here I only have 
one activity), but using a Linear layout allowed me to set up the layout of screen (see images). This 
layout is set in a linear fashion, at the top of the screen I have a Spinner widget, in the middle I have a
button widget, and lastly a textView (which is used to display the type of beer). I know there are other 
layouts you can use, such as horizontal layouts which would place widgets the the right or left of each 
other. Android Studio does a look of code generation for you when you set up a new project, and even allows 
you to use the Display software to drag and drop different components to your app; generating the XML for you.
This brings me to my next learning point. 
`
## 4. XML

`
I never truly used XML before, although I've seen it while admiring other developer's code. When I first created 
my project, Android generated tons of code and I quickly used drag and drop to add components, which generated its
own XML code. I had no idea what it meant so I decided to learn a bit of XML on the fly to figure out how to really
build this simple layout. Every widget you use in a layout will have an 'id' (android:id=@+id/"idname") that acts as 
a reference to that widget. Amongst many things you'll set the height, weight, gravity, text, and in some cases the 
activity (ex: onClick="onClickFindBeer") which is a reference to a method in the mainActivity.java file, to many of 
the widget components. Although drag and drop is a great way to boost productivity and lower the amount of time it
takes to complete projects, I'd recommend, if anything, to understand the basics of XML. 
`


