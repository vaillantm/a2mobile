# Assignment #2 INSY 8414 - Mobile Programming, 2025-2026

## What I did
- Built an Android app with three Activities: Login, Sign-Up, and User Details.
- Designed each screen with multiple layouts and widgets (ConstraintLayout + LinearLayout, TextView, EditText, Button, RadioButton, CheckBox).
- Added navigation links/buttons to move between the required screens.

## How I did it
- Created three XML layout files:
- Built a simple UI using custom colors and rounded shape drawables 
- Implemented Activity logic 3 files
- Passed user data from Sign-Up and Login to User Details using Intent extras.

## Navigation implemented
- Login ? Sign-Up: Create an account link on Login screen.
- Sign-Up ? User Details: Create account button on Sign-Up screen.
- Login (successful) ? User Details: Sign In button on Login screen.

## Extra credit features implemented
- Simple validation
  - Login: email and password cannot be empty.
  - Sign-Up: name/email/password required + must accept terms checkbox.
- Toast messages confirming navigation:
  - Login successful
  - Account created
  - Validation error Toasts when fields are missing.

## Notes on User Details display
- From Sign-Up: shows the exact name, email, and role entered.
- From Login: shows the email entered; name defaults to �User� and role reflects the remember-me checkbox.
