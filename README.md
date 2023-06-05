# Student Register

Welcome to the Student Register repository! This repository contains a simple web application that allows you to manage a student database. You can add, view, update, and delete student records using this application.

## Features

- Add new students to the database by providing their details such as name and Email.
- View a list of all registered students along with their details.
- Update the information of existing students.
- Delete student records from the database.

## Technologies Used

The Student Register application is built using the following technologies:

- **Kotlin:** The primary programming language used for backend development.
- **Room: ** Room is an Android library that provides an abstraction layer over SQLite, allowing for simplified database access and management through the use of annotations and pre-compiled SQL queries.
- **ViewModel:**ViewModel is an Android architecture component that stores and manages UI-related data, preserving data across configuration changes and providing separation of concerns between UI and data handling logic
 **LiveData:**LiveData is an observable data holder class in Android that allows data to be observed by UI components, ensuring they always have the most up-to-date data and automatically updating the UI when the data changes
 **Coroutines:**Coroutines are a Kotlin feature that provide a simple and efficient way to write asynchronous code in a sequential manner, allowing for asynchronous programming without the complexities of traditional callback or thread-based approaches.
 
 
## Installation

To run this application locally, please follow these steps:

1. Clone the repository:

git clone https://github.com/pro-utkarshM/StudentRegister.git


2. Navigate to the project directory:

cd StudentRegister


3. Run the application using the provided Gradle wrapper


## Usage

The Student Register application provides a user-friendly interface to manage student records. Follow the steps below to use the application:

1. **Add a new student:**
   - On the home page, click on the "Add Student" button.
   - Fill in the required details (name and email) in the provided form.
   - Click on the "Submit" button to add the student to the database.

2. **View student records:**
   - On the home page, you will see a list of all registered students.
   - Each student entry displays their name and email.

3. **Update a student record:**
   - To update a student's information, click on the "Edit" button next to the respective student entry.
   - Modify the student's details in the form that appears.
   - Click on the "Update" button to save the changes.

4. **Delete a student record:**
   - To delete a student from the database, click on the "Delete" button next to the respective student entry.
   - Confirm the deletion when prompted.

## Contributing

Contributions to this project are welcome! If you find any issues or have suggestions for improvements, please open an issue on the GitHub repository.

If you wish to contribute to the codebase, please follow these steps:

1. Fork the repository.
2. Create a new branch for your feature or bug fix.
3. Make your changes and commit them with descriptive commit messages.
4. Push your changes to your forked repository.
5. Open a pull request in the original repository, describing your changes.

## License

This project is licensed under the [MIT License](LICENSE).

## Acknowledgements

- This project was developed by [Utkarsh Maurya](https://github.com/pro-utkarshM) as a sample application.

Thank you for using the Student Register application!
