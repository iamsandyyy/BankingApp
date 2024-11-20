import React, { useState } from 'react';
import axios from 'axios';

function LoginSignup() {
    const [username, setUsername] = useState('');
    const [password, setPassword] = useState('');
    const [isLoginMode, setIsLoginMode] = useState(true);

    const handleSubmit = async (e) => {
        e.preventDefault();
        try {
            const response = await axios.post('/api/auth/' + (isLoginMode ? 'login' : 'signup'), {
                username,
                password
            });
            // Handle successful login/signup (e.g., store token)
        } catch (error) {
            console.error(error);
        }
    };

    return (
        // ... JSX for login/signup form
    );
}

export default LoginSignup;
