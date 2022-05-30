# Library Manager

Desktop application for library lending management.

## Requirements

### Functional requirements

- Register books
- Set the number of copies of each book
- Register library users
- Register the lending of books to users
- Register the return of books
- Set the time to the return of books
- Set the fine for delays
- Set a limit to the number of lendings any user is allowed to have
- Calculate the fine for delay and add it to the user's total pending fine
- Register the payment of fines
- Show all books
- Show all users
- Show a book's current lendings
- Show a book's history of lendings
- Show an user's current lendings
- Show an user's history of lendings
- Show an user's total pending fine

### Business rules

- No login system. Any user of the software have admin privileges 
- An user can only have a single copy of a book borrowed at a time
- A book can't be lend if currently all its copies are lend
- An user with pending fines can't borrow any books

## Entities

### Book
- Title
- Author name
- Edition
- Release date
- Number of copies owned
- Id

### User
- Name
- Pending fine
- Phone number
- Id

### Lending
- Book
- User
- Lending date
- Returned
- Return date

## Technologies used

- Java
- MySQL