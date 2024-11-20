import React from 'react';
import { Link } from 'react-router-dom';

const Navbar = () => {
    return (
        <>
            <nav className="navbar navbar-expand-md navbar-dark bg-dark fixed-top">
                <a className="navbar-brand" href="#">Account Details</a>
                <button className="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarsExampleDefault" aria-controls="navbarsExampleDefault" aria-expanded="false" aria-label="Toggle navigation">
                    <span className="navbar-toggler-icon"></span>
                </button>

                <div className="collapse navbar-collapse" id="navbarsExampleDefault">
                    <ul className="navbar-nav mr-auto">
                        <li className="nav-item">
                            <Link className="nav-link" to="/account">Account</Link>
                        </li>
                        <li className="nav-item">
                            <Link className="nav-link" to="/createAccount">Create Account</Link>
                        </li>
                        <li className="nav-item">
                            <Link className="nav-link" to="/enableAccount">Enable Account</Link>
                        </li>
                        <li className="nav-item">
                            <Link className="nav-link" to="/disabledAccount">Disable Account</Link>
                        </li>
                        <li className="nav-item">
                            <Link className="nav-link" to="/fetchAccountById">Fetch Account by ID</Link>
                        </li>
                        <li className="nav-item">
                            <Link className="nav-link" to="/depositAmount">Deposit Amount</Link>
                        </li>
                        <li className="nav-item">
                            <Link className="nav-link" to="/withdrawAmount">Withdraw Amount</Link>
                        </li>
                        <li className="nav-item">
                            <Link className="nav-link" to="/transferAmount">Transfer Amount</Link>
                        </li>
                        <li className="nav-item">
                            <Link className="nav-link" to="/login">Login</Link> {/* New */}
                        </li>
                        <li className="nav-item">
                            <Link className="nav-link" to="/transactions">Transaction List</Link> {/* New */}
                        </li>
                        <li className="nav-item">
                            <Link className="nav-link" to="/creditCardPayment">Credit Card Payment</Link> {/* New */}
                        </li>
                        <li className="nav-item">
                            <Link className="nav-link" to="/loanRequest">Loan Request</Link> {/* New */}
                        </li>
                    </ul>
                </div>
            </nav>
        </>
    );
}

export default Navbar;