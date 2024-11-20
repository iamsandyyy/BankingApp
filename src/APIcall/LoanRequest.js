import React, { useState } from 'react';
import ApiService from '../service/ApiService';

const LoanRequest = () => {
    const [amount, setAmount] = useState('');

    const handleLoanRequest = async (e) => {
        e.preventDefault();
        try {
            await ApiService.requestLoan({ amount });
            alert('Loan request submitted!');
        } catch (error) {
            console.error(error);
            alert('Failed to submit loan request.');
        }
    };

    return (
        <div>
            <h2>Loan Request</h2>
            <form onSubmit={handleLoanRequest}>
                <input type="number" placeholder="Loan Amount" onChange={e => setAmount(e.target.value)} required />
                <button type="submit">Request Loan</button>
            </form>
        </div>
    );
};

export default LoanRequest;