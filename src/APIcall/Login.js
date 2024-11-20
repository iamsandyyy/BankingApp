import React, { useState } from 'react';
import ApiService from '../service/ApiService';

const Login = () => {
    const [username, setUsername] = useState('');
    const [password, setPassword] = useState('');

    const handleLogin = async (e) => {
        e.preventDefault();
        try {
            const response = await ApiService.login({ username, password });
            localStorage.setItem('token', response.data.token);
            alert('Login successful!');
        } catch (error) {
            console.error(error);
            alert('Failed to login.');
        }
    };

    return (
        <div>
            <h2>Login</h2>
            <form onSubmit={handleLogin}>
                <input type="text" placeholder="Username" onChange={e => setUsername(e.target.value)} required />
                <input type="password" placeholder="Password" onChange={e => setPassword(e.target.value)} required />
                <button type="submit">Login</button>
            </form>
        </div>
    );
};

export default Login;