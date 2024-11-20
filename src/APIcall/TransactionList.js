import React, { useEffect, useState } from 'react';
import ApiService from '../service/ApiService';

const TransactionList = () => {
    const [transactions, setTransactions] = useState([]);

    useEffect(() => {
        const fetchTransactions = async () => {
            const response = await ApiService.getTransactions();
            setTransactions(response.data);
        };
        fetchTransactions();
    }, []);

    return (
        <div>
            <h2>Transaction List</h2>
            <ul>
                {transactions.map(transaction => (
                    <li key={transaction.id}>{transaction.description} - ${transaction.amount}</li>
                ))}
            </ul>
        </div>
    );
};

export default TransactionList;