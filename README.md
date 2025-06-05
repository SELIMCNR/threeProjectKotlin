### **README - Android Uygulamasında Toast ve AlertDialog Kullanımı**   tr

#### **Proje Tanıtımı**  
Bu Android uygulaması, **Toast mesajları ve AlertDialog kullanarak** kullanıcıya bilgi vermeyi ve etkileşim sağlamayı gösterir. **MainActivity** içinde **butonlar** ve **kayıt işlemi için bir uyarı penceresi** bulunmaktadır. Kullanıcı, ekrandaki butona bastığında **Toast mesajları** ile bilgilendirilir. Ayrıca, **kayıt işlemi için bir AlertDialog** açılır ve kullanıcının onayına bağlı olarak işlem tamamlanır veya iptal edilir.  

---

### **Kullanılan Teknolojiler**  
- **Kotlin** (Android geliştirme)  
- **ViewBinding** (UI elemanlarını yönetmek için)  
- **Toast** (Kullanıcıya kısa mesaj göstermek için)  
- **AlertDialog** (Onay gerektiren işlemler için uyarı penceresi)  

---

### **Proje Yapısı**  
#### **📌 MainActivity.kt**  
- `ViewBinding` ile arayüz elemanlarını yönetir.  
- **Toast Mesajları**: Kullanıcı butona bastığında ekranda mesaj gösterir.  
- **AlertDialog**: Kullanıcının kayıt işlemini onaylamasını veya iptal etmesini sağlar.  

#### **📌 activity_main.xml**  
- **Bir adet buton** ile kullanıcı etkileşimi sağlanır.  

---

### **Nasıl Çalışıyor?**  
1️⃣ **Toast Mesajları:**  
   - Kullanıcı butona bastığında `Toast.makeText()` kullanılarak kısa bir mesaj ekranda gösterilir.  
   - **İki farklı yöntem** ile buton tıklama işlemi tanımlanmıştır:  
     - **Anonim İç Sınıf (`object : View.OnClickListener`)** kullanımı  
     - **Lambda (`binding.button.setOnClickListener`)** ile kısa ve okunabilir kod  

2️⃣ **Kayıt İşlemi & AlertDialog:**  
   - Kullanıcı, **"Kayıt Et"** işlemi başlattığında `AlertDialog` açılır.  
   - **Evet** seçilirse: Kullanıcıya "Kayıt Edildi" mesajı gösterilir.  
   - **Hayır** seçilirse: Kullanıcıya "Kayıt Edilmedi" mesajı gösterilir.  

---

### **Kurulum & Kullanım**  
1️⃣ **Android Studio** ile projeyi açın.  
2️⃣ **Gerçek cihaz** veya **emülatör** üzerinde çalıştırın.  
3️⃣ Butona basarak **Toast mesajlarını test edin**.  
4️⃣ "Kayıt Et" işlemini deneyerek **AlertDialog kullanımını inceleyin**.  


### **README - Using Toast and AlertDialog in Android Application** eng

#### **Project Introduction**
This Android application demonstrates how to provide information and interaction to the user using **Toast messages and AlertDialog**. In **MainActivity** there are **buttons** and **an alert window** for the registration process. When the user presses the button on the screen, they are notified with **Toast messages**. In addition, an **AlertDialog** for the registration process opens and the process is completed or canceled depending on the user's approval.

---

### **Technologies Used**
- **Kotlin** (Android development)
- **ViewBinding** (To manage UI elements)
- **Toast** (To display short messages to the user)
- **AlertDialog** (Alert window for operations requiring approval)

---

### **Project Structure**
#### **📌 MainActivity.kt**
- Manages interface elements with `ViewBinding`.
- **Toast Messages**: Displays a message on the screen when the user presses the button.
- **AlertDialog**: Allows the user to confirm or cancel the registration process.

#### **📌 activity_main.xml**
- User interaction is provided with **one button**.

---

### **How ​​Does It Work?**

1️⃣ **Toast Messages:**

- When the user clicks the button, a short message is displayed on the screen using `Toast.makeText()`.

- Button click operation is defined with **two different methods**:

- Using **Anonymous Inner Class (`object : View.OnClickListener`)**

- Short and readable code with **Lambda (`binding.button.setOnClickListener`)**

2️⃣ **Registering Process & AlertDialog:**

- When the user starts the **"Register"** operation, `AlertDialog` opens.

- If **Yes** is selected: The user is shown the "Registered" message.

- If **No** is selected: The user is shown the "Not Registered" message.

---

### **Installation & Usage**
1️⃣ Open the project with **Android Studio**.
2️⃣ Run on **Real device** or **Emulator**.
3️⃣ Test Toast messages by pressing the button**.
4️⃣ Test the **AlertDialog usage** by trying the "Save" action.
