# E-Commerce App Demo

This repository contains a demonstration of an E-Commerce Android application built using Kotlin. The app utilizes Room for local database storage, follows the MVVM architecture pattern, integrates Coroutines for asynchronous programming, and utilizes Glide for image loading. The UI design is based on a free UI kit from Figma.

## Features

- **User Authentication**: Users can sign up, log in, and log out.
- **Product Listing**: Display of products with details such as name, price, and image.
- **Product Details**: View detailed information about each product.
- **Shopping Cart**: Users can add products to their shopping cart and view their cart.
- **Order Placement**: Users can place orders for products.
- **Local Database Storage**: Utilizes Room for local storage of user and product data.
- **MVVM Architecture**: Follows the Model-View-ViewModel architecture pattern for clean and maintainable code.
- **Coroutines**: Uses Kotlin Coroutines for managing asynchronous tasks.
- **Glide**: Utilizes Glide for efficient and smooth image loading.
- **Supabase Database Integration**: Integration with Supabase database for storing product and user information securely.

## Prerequisites

- Android Studio IDE
- Android SDK
- Kotlin

## Getting Started

To get started with the project, follow these steps:

1. Clone the repository to your local machine:

```
git clone https://github.com/your_username/e-commerce-app.git
```

2. Open the project in Android Studio.

3. Build and run the project on an Android emulator or a physical device.

## Configuration

Before running the app, you need to configure the Supabase database connection. Follow these steps:

1. Sign up for a Supabase account at [Supabase](https://supabase.io/).

2. Create a new project and database on Supabase.

3. Copy the URL and API Key from your Supabase project.

4. Replace the `supabaseUrl` and `supabaseKey` in the project with your own Supabase URL and API Key.

## UI Kit

The UI design for this app is based on a free UI kit from Figma.

## Contributing

Contributions are welcome! If you'd like to contribute to the project, please follow these steps:

1. Fork the repository.

2. Create a new branch for your feature or bug fix:

```
git checkout -b feature/your_feature_name
```

3. Commit your changes:

```
git commit -m "Add your commit message here"
```

4. Push your branch to your fork:

```
git push origin feature/your_feature_name
```

5. Create a pull request against the `main` branch of the original repository.

## License

This project is licensed under the [MIT License](LICENSE).

## Acknowledgments

Special thanks to the contributors and developers of the libraries, frameworks, and the Figma UI kit used in this project.

---

Feel free to explore the code and experiment with the features. If you have any questions or feedback, please open an issue or reach out to us. Happy coding!
