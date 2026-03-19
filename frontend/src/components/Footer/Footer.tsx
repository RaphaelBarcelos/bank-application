import './Footer.css';

const footerItems = [
    {
        title: 'Transparency',
        items: [
            { name: 'Privacy Policy', href: '/' },
            { name: 'Terms of Service', href: '/' },
            { name: 'Cookie Policy', href: '/' },
        ],
    },
    {
        title: 'Support',
        items: [
            { name: 'Contact Us', href: '/' },
            { name: 'Help Center', href: '/' },
            { name: 'FAQs', href: '/' },
        ],
    },
    {
        title: 'Company',
        items: [
            { name: 'About Us', href: '/' },
            { name: 'Careers', href: '/' },
            { name: 'Press', href: '/' },
        ],
    },
];

export function Footer() {
    return (
        <footer>
            <div className='footer-columns'>
                {footerItems.map((column) => (
                    <div key={column.title}>
                        <h4>{column.title}</h4>
                        <ul>
                            {column.items.map((item) => (
                                <li key={item.name}>
                                    <a href={item.href}>{item.name}</a>
                                </li>
                            ))}
                        </ul>
                    </div>
                ))}
            </div>
            <div className='bank-info'>
                <h2>BankName</h2>
                <p>&copy; 2026 BankName. All rights reserved.</p>
            </div>
        </footer>
    )
}