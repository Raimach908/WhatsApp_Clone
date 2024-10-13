
**WhatsApp Clone**

A WhatsApp-like messaging application developed for Android, featuring a modern UI and essential messaging functionalities. This project is designed to practice and demonstrate Android development skills using ViewModel, LiveData, RecyclerView, Navigation Component, and Firebase for real-time data sync.

**Project Overview**

The WhatsApp Clone project replicates the core features of WhatsApp, including:

User Authentication: Sign up, login, and logout.
Profile Management: Create, edit, and view profile details.
Real-Time Chat: Send and receive messages instantly.
Media Sharing: Share images within chats.
Push Notifications: Notify users of new messages.
Goal: Practice real-time data handling, complex UI structures, and Firebase integration within Android.

**🛠 Setup Instructions**

To get started, follow these steps:

**Clone the Repository**

git clone https://github.com/Raimach908/WhatsApp_Clone.git

cd whatsapp-clone

**Open in Android Studio**

Open Android Studio.
Choose Open an Existing Project and select the cloned repository.

**Set Up Firebase**

Create a new Firebase project at Firebase Console.
Add an Android app to your Firebase project and download the google-services.json file.
Place the google-services.json file in the app/ directory of the project.

**Build and Run**

Sync Gradle files.
Build and run the app on an emulator or Android device.

**📱 Screens Designed and Their Purpose**

Screen	Purpose
Splash Screen	Initial loading screen, leads to login or home based on user authentication status.
Login Screen	Allows users to log in with existing credentials.
Sign-Up Screen	Registers new users by collecting basic information.
Home Screen	Displays active chats, recent messages, and options to start new conversations.
Chat Screen	Main chat interface for exchanging text and images in real-time.
Profile Screen	Allows users to view and edit profile details, such as picture, name, and status.
Settings Screen	Provides access to preferences, notifications, and account management options.

**🧩 Technical Challenges Faced**

Real-Time Sync: Ensuring efficient real-time message synchronization using Firebase.
Authentication Flow: Handling user sessions and secure login flows with Firebase Auth.
Media Permissions: Managing permissions for image access and handling media uploads.
Navigation Consistency: Using Navigation Component to maintain a smooth UI experience.

**🌐 Future Plans**

Voice & Video Calls: Adding real-time voice and video calling functionality.
End-to-End Encryption: Implementing message encryption to enhance privacy.
Enhanced Notifications: Supporting rich notifications for a more responsive experience.
Message Reactions: Enabling reactions on individual messages with emojis.
Status Updates: Adding functionality for users to post visible status updates.

