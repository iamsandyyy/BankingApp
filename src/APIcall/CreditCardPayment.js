import React, { useState } from 'react';
import ApiService from '../service/ApiService';

const CreditCardPayment = () => {
    const [amount, setAmount] = useState('');

    const handlePayment = async (e) => {
        e.preventDefault();
        try {
            await ApiService.payCreditCardBill({ amount });
            alert('Payment successful!');
        } catch (error) {
            console.error(error);
            alert('Failed to make payment.');
        }
    };

    return (
        <div>
            <h2>Credit Card Payment</h2>
            <form onSubmit={handlePayment}>
                <input type="number" placeholder="Amount" onChange={e => setAmount(e.target.value)} required />
                <button type="submit">Pay Bill</button>
            </form>
        </div>
    );
};

export default CreditCardPayment;