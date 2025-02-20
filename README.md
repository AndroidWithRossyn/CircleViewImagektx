<h2 align="center">CircleImageView Kotlin</h2>

## Thanks to [Henning Dodenhof](https://github.com/hdodenhof) for Java [Libraray](https://github.com/hdodenhof/CircleImageView)

<p align="center">
    <a href="">
      <img src="https://github.com/user-attachments/assets/aa99156b-646d-4a64-9f47-4fa2b063981d" width="1000" />
    </a>
  </p>




It uses a BitmapShader and does not:

- create a copy of the original bitmap
- use a clipPath (which is neither hardware accelerated nor anti-aliased)
- use setXfermode to clip the bitmap (which means drawing twice to the canvas)

As this is just a custom ImageView and not a custom Drawable or a combination of both, it can be used with all kinds of drawables, i.e. a PicassoDrawable from Picasso or other non-standard drawables (needs some testing though).



--- 

To use the `CircleImageView` class in your Android project, follow these steps:

### 1. **Add the `CircleImageView` class to your project:**

Ensure that you have the `CircleImageView` class code in your project. This code should be in a Kotlin file, such as `CircleImageView.kt`.

### 2. **Include the `CircleImageView` in your layout XML:**

Once the class is added to your project, you can use it in your XML layouts just like any other view. Here's how to include it in an XML layout file:

```xml
<your.package.name.CircleImageView
    android:id="@+id/profile_image"
    android:layout_width="100dp"
    android:layout_height="100dp"
    android:src="@drawable/your_image"
    app:civ_border_width="2dp"
    app:civ_border_color="@android:color/white"
    app:civ_circle_background_color="@android:color/black"
    app:civ_border_overlay="true" />
```

### 3. **Reference `CircleImageView` in your Activity or Fragment:**

You can reference and manipulate the `CircleImageView` programmatically in your Activity or Fragment as follows:

```kotlin
// In your Activity or Fragment
val profileImageView = findViewById<CircleImageView>(R.id.profile_image)

// Set border color programmatically
profileImageView.borderColor = Color.RED

// Set border width programmatically
profileImageView.borderWidth = 5 // in pixels

// Set circle background color programmatically
profileImageView.circleBackgroundColor = Color.BLUE

// Load an image from a URL using Glide (if using Glide)
Glide.with(this)
    .load("https://example.com/image.jpg")
    .into(profileImageView)
```

### 4. **Customize Attributes via XML:**

In your XML layout, you can customize various attributes of the `CircleImageView`:
- `app:civ_border_width`: Sets the border width around the circular image.
- `app:civ_border_color`: Sets the border color.
- `app:civ_circle_background_color`: Sets the background color of the circle.
- `app:civ_border_overlay`: If true, the border is drawn on top of the image.

### 5. **Attributes Overview:**

- **`civ_border_width`**: The width of the border around the image.
- **`civ_border_color`**: The color of the border.
- **`civ_circle_background_color`**: The background color of the circle.
- **`civ_border_overlay`**: If `true`, the border overlays the image; otherwise, it surrounds the image.


Elevate your Android app to the next level with our state-of-the-art solutions! Contact us today and let’s create something extraordinary!

<div align="start">
  
<a href="mailto:banrossyn@gmail.com"><img src="https://img.shields.io/badge/Gmail-EA4335.svg?logo=Gmail&logoColor=white"></a>
[![Instagram](https://img.shields.io/badge/Instagram-%23E4405F.svg?logo=Instagram&logoColor=white)](https://instagram.com/rohitraj.khorwal) [![LinkedIn](https://img.shields.io/badge/LinkedIn-%230077B5.svg?logo=linkedin&logoColor=white)](https://www.linkedin.com/in/rohitrajkhorwal/) [![Medium](https://img.shields.io/badge/Medium-12100E?logo=medium&logoColor=white)](https://medium.com/@rohitrajkhorwal) 
<a href="https://t.me/banrossyn" target="_blank"><img src="https://img.shields.io/badge/Telegram-26A5E4.svg?logo=Telegram&logoColor=white"></a>
<a href="https://wa.me/+919694260426/" target="_blank"><img src="https://img.shields.io/badge/WhatsApp-25D366.svg?logo=WhatsApp&logoColor=white">
</div>


---

`Note:` Please review our [Code of Conduct](./CODE_OF_CONDUCT.md) before using this project.
# Find this Repository useful? ❤️

Support it by joining stargazers for this repository. ⭐

Also, [follow me on GitHub](https://github.com/AndroidWithRossyn/) for my next creations! 🤩

<p align="left">
<a href="https://github.com/AndroidWithRossyn?tab=repositories&sort=stargazers"><img alt="All Repositories" title="All Repositories" src="https://custom-icon-badges.demolab.com/badge/-Click%20Here%20For%20All%20My%20Repos-1F222E?style=for-the-badge&logoColor=white&logo=repo"/></a>
  
</p>


## ☕ Fuel My Code

<div align="center">
  <a href="https://www.paypal.com/paypalme/banrossyn">
    <img src="https://img.shields.io/badge/Support_My_Work-00457C?style=for-the-badge&logo=paypal&logoColor=white" alt="PayPal"/>
  </a>
   <a href="https://github.com/AndroidWithRossyn/AndroidWithRossyn/blob/main/donate/upi_scan.jpg?raw=true">
    <img src="https://img.shields.io/badge/Support_via_UPI-4CAF50?style=for-the-badge&logo=google-pay&logoColor=white" alt="UPI"/>
  </a>
  <p><i>Your support transforms caffeine into code! ✨</i></p>
  
  <table>
    <tr>
      <td>🚀 Faster Updates</td>
      <td>🔍 Better Documentation</td>
      <td>🛠️ More Features</td>
    </tr>
  </table>
  
  <details>
    <summary><b>Why Support?</b></summary>
    <p>Every contribution helps me dedicate more time to creating high-quality open source Code. Your support directly translates to better software for everyone!</p>
  </details>
</div>



## License

```
Copyright: 
~ Rossyn
~ Rohitraj Khorwal

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```

<p align="center">
  <img src="https://capsule-render.vercel.app/api?type=waving&color=gradient&height=60&section=footer"/>
</p>









