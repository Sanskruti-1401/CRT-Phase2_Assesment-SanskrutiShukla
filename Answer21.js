async function loadUsers() {
    try {
        const response = await fetch('/api/users');

        if (!response.ok) {
            throw new Error('Failed to load users');
        }

        const users = await response.json();

        const userList = document.getElementById('user-list');
        userList.innerHTML = '';

        users.forEach(user => {
            const li = document.createElement('li');
            li.textContent = user.name;
            userList.appendChild(li);
        });

    } catch (error) {
        document.getElementById('error').textContent = error.message;
    }
}