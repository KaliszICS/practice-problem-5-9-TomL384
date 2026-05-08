[![Open in Codespaces](https://classroom.github.com/assets/launch-codespace-2972f46106e565e64193e422d61a12cf1da4916b45550586e14ef0a7c637dd04.svg)](https://classroom.github.com/open-in-codespaces?assignment_repo_id=23860361)
# Instructions  

1. Write a function processBackspaces(String input) that processes a string where the # character represents a backspace.
Iterate through the string. If you see a letter, push it onto the ArrayDeque (acting as a stack). If you see a #, pop the last character added.
Return the final String</br>

Example: processBackspaces("abc#d##c") should return "ac".


2. Create a function called simulateLine(String[] commands)that processes these actions using an ArrayDeque.
The Rules:

ENQUEUE Name: A regular guest joins the back of the line.</br>
VIP Name: A VIP guest jumps to the very front of the line.</br>
SERVE: The person at the front goes on the ride and leaves the line.</br>
REQUEUE: The person at the front is told they aren't tall enough yet; they must leave the front and immediately join the back of the line.</br>
SCARE: A mascot scares the person at the back of the line so much that they leave the line entirely.</br>

Example Input:

String[] cmds = {</br>
    "ENQUEUE Alice", </br>
    "ENQUEUE Bob", </br>
    "VIP Charlie", </br>
    "SERVE", </br>
    "REQUEUE", </br>
    "ENQUEUE David", </br>
    "SCARE"</br>
};

Step-by-Step Logic for Students:</br>
ENQUEUE Alice: [Alice]</br>
ENQUEUE Bob: [Alice, Bob]</br>
VIP Charlie: [Charlie, Alice, Bob] (Front is now Charlie)</br>
SERVE: Charlie leaves. [Alice, Bob]</br>
REQUEUE: Alice moves from front to back. [Bob, Alice]</br>
ENQUEUE David: [Bob, Alice, David]</br>
SCARE: David leaves the back. Final state: [Bob, Alice]
