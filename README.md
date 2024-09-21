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

### Find this Repository useful? ❤️
Support it by joining stargazers for this repository. ⭐

Also, [follow me on GitHub](https://github.com/AndroidWithRossyn/) for my next creations! 🤩


### License
```
Copyright 2024 Rossyn

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
  <img src="https://capsule-render.vercel.app/api?type=waving&color=gradient&height=60&width=1980&section=footer"/>
</p>





