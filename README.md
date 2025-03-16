# 🌟 WishList App

Welcome to **WishList**, the ultimate app for managing your wishes effortlessly! With a sleek, modern UI and a seamless user experience, keeping track of your wishes has never been easier.

---

## ✨ Features at a Glance

✅ **Create Wishes** – Add wishes with a title and description.  
👀 **View Wishes** – Browse all your wishes in a clean, organized list.  
📝 **Edit Wishes** – Modify wish details effortlessly.  
🗑 **Delete Wishes** – Swipe-to-dismiss for a smooth deletion experience.  
🚨 **Error Handling** – Get user-friendly notifications to keep things running smoothly.  
🎨 **Modern UI** – Powered by **Material Design 3** for a polished look and feel.  

---

## 🛠 Tech Stack

- **Language**: Kotlin 🛑  
- **UI Framework**: Jetpack Compose 📱  
- **Database**: Room 🗄️  
- **Architecture**: MVVM (Model-View-ViewModel) 🏗️  
- **Asynchronous Programming**: Kotlin Coroutines ⚡  
- **Dependency Management**: Manual dependency graph 🔗  

---

## 🏗 Key Components Breakdown

### 📂 **Data Layer**

🔹 **Wish** – Represents each wish list item.  
🔹 **WishDao** – Handles database CRUD operations.  
🔹 **WishRepository** – Bridges the gap between data and ViewModel.  

### 🎨 **UI Layer**

🔹 **WishListViewModel** – Manages UI state and business logic.  
🔹 **AddEditDetailView** – Composable screen for adding & editing wishes.  
🔹 **AppBarView** – A custom app bar for smooth navigation.  
🔹 **Validation** – Ensures valid inputs (e.g., title length: 1-50 characters).  

### 🚀 **Navigation**

- Uses **Android Navigation Component** for seamless screen transitions.  

### **Installation Steps**

1️⃣ Clone the repository:
   ```sh
   https://github.com/Sakshar-Devgon/WishListApp.git
   ```
2️⃣ Open the project in **Android Studio**.  
3️⃣ Sync **Gradle dependencies**.  
4️⃣ Run the app on an **emulator** or a **physical device**.  

---

## 📷 Screenshots

Here’s a glimpse of the app in action:

<table>
  <tr>
    <td align="center"><b>Add Wish(Click on Plus Icon on Home View) </b></td>
    <td align="center"><b>Home View (Main UI)</b></td>
  </tr>
  <tr>
    <td><img src="https://github.com/user-attachments/assets/ffdb66bb-fb6d-4ea2-8069-e2d2c1f2751a" width="300"></td>
    <td><img src="https://github.com/user-attachments/assets/116da40f-12e1-475a-83f7-e1d9f93f86a1" width="300"></td>
  </tr>
  <tr>
    <td align="center"><b>Update Wish(Tap on your wish to update)</b></td>
    <td align="center"><b>Delete Wish(Swipe to Delete)</b></td>
  </tr>
  <tr>
    <td><img src="https://github.com/user-attachments/assets/bcb5b105-ce1a-4b1b-977b-78939d75caf8" width="300"></td>
    <td><img src="https://github.com/user-attachments/assets/1dffcd2f-49b2-4ed8-9ede-545bb212f42f" width="300"></td>
  </tr>
</table>

## 🎯 Conclusion  

WishList is designed to provide a seamless and enjoyable way to manage your wishes. With its **modern UI, smooth navigation, and powerful features**, this app makes wish management effortless. Whether you're adding, editing, or deleting wishes, the experience is intuitive and fluid.  

I'm always looking to enhance the app with new features and improvements. If you have any suggestions or want to contribute, feel free to get involved!  

Happy wishing! 🌟✨  

